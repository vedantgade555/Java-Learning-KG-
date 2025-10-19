package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        for (Integer i : queue) {
            System.out.printf("%d ",i);
        }
        Utility.print(queue);
    }
}
