package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

    //    Deque = double ended queue
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);

//        System.out.println(deque);
//        System.out.println(deque.peek());
//        System.out.println(deque.pop());
//        System.out.println(deque.pollFirst());

//        for (Iterator iterator = deque.iterator(); iterator.hasNext();){
//            System.out.println(iterator.next());
//        }
        for (Iterator iterator = deque.descendingIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

    }
}
