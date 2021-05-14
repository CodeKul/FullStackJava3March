package java8;

import java.util.stream.Stream;

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