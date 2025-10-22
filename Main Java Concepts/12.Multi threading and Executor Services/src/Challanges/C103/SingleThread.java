package Challanges.C103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
    public static void main(String[] args) {
//        When we write try with resource so we dont need to shutdown service it will automatically called
        try(ExecutorService service = Executors.newSingleThreadExecutor())
        {
            PrintNo task = new PrintNo();
            service.submit(task);
        }
    }
}
