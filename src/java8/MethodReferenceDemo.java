package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
//method reference to instance method
    public static void main(String[] args) {
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        //refer
        MyInterface5 myInterface5 = methodReferenceDemo::display;
//        calling method
        System.out.println(myInterface5.msg());

        List<Integer> list = Arrays.asList(1,2,34,5);
        list.forEach(System.out::println);
    }

    public String display(){
        return "Hello";
    }

}

@FunctionalInterface
interface MyInterface5{

    String msg();
}