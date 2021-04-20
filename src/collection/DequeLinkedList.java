package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkedList {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.addFirst(70);
        deque.addLast(70);

        deque.offer(80);
        deque.removeFirstOccurrence(70);
        deque.remove(10);
        deque.getFirst();
        deque.getLast();
        System.out.println(deque);
    }
}
