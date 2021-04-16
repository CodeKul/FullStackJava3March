package collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);//0
        stack.push(20);//1
        stack.push(30);//2
        stack.push(40);//3

        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.size());
//        System.out.println(stack.pop());// remove the top or head
//        System.out.println(stack.remove(1));// remove the element by index
//        System.out.println(stack.remove(Integer.valueOf(30))); // remove the element by object
        System.out.println(stack.search(20));// return position from top element
//        System.out.println(stack);
    }
}
