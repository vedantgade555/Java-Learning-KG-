package Challanges.C105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestFact {
    public static void main(String[] args) {
        try( ExecutorService service = Executors.newFixedThreadPool(3) ){
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                FactorialCalc task = new FactorialCalc(i);
                list.add(service.submit(task));
            }

            for(Future<Integer> future : list){
                System.out.printf("\n Result is %d",future.get());
            }

            service.shutdown();
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.printf("EMERGENCY SHUT DOWN");
                service.shutdownNow();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
