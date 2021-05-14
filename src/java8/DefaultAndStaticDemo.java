package java8;

import java.util.stream.Stream;

/**
 * interface in java can only have abstract methods.
 * All the methods of interfaces are public & abstract by default.
 * Java 8 allows the interfaces to have default and static methods.
 * The reason we have default methods in interfaces is to allow the developers to
 * add new methods to the interfaces without affecting the classes that implements these
 * interfaces.
 *
 */
public class DefaultAndStaticDemo implements  Myinterface3,MyInterface4{

    public static void main(String[] args) {

        DefaultAndStaticDemo defaultAndStaticDemo = new DefaultAndStaticDemo();
        System.out.println(defaultAndStaticDemo.msg());
        System.out.println(defaultAndStaticDemo.display());
        System.out.println(Myinterface3.send());

    }

    @Override
    public String msg() {
        return "Heeloo";
    }

    @Override
    public String display() {
        return "custom implementation";
    }
}


interface Myinterface3{

    String msg();//declare method
    default String display(){
        return "Hello in display()";
    };

    static String send(){
        return "In send method()";
    }
}

interface MyInterface4{

    default String display(){
        return "Hello in display from 4";
    }
}