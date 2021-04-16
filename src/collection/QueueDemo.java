package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        FIFO

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);// it add element and whenever queue is full then it return exception
        System.out.println(queue.offer(50));// it add element and whenever queue is full it return false

//        System.out.println(queue);
//        System.out.println(queue.peek());// return the head or top when queue empty then it return null
        System.out.println(queue.element());// return the head or top when queue empty then it return exception
//        System.out.println(queue.size());// return the size of queue
//        System.out.println(queue.poll());// remove the head or top when queue is empty then it return null
//        System.out.println(queue.remove());// remove the head or top  when queue is empty then it return exception
        System.out.println(queue);

    }
}
