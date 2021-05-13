package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * lambada expression is called anonymous function
 * declaration=>
 * (p1,p2...) ->{ body expression}
 * uses=> it provide implementation of functional interface
 * it takes less code
 *
 */
public class LambdaExpressionDemo {

    public static void main(String[] args) {

        Myinterface myinterface =()->{
            return "Hello";
        };

        System.out.println(myinterface.msg());

        MyInterface2 myInterface2 = (i,j)->{
            return i+j;
        };

        System.out.println(myInterface2.add(5,6));


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);


        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list.forEach(consumer);



    }
}

@FunctionalInterface
interface Myinterface{
    String msg();
    default String display(){
       return "stst";
    };

    int hashCode();
}

@FunctionalInterface
interface MyInterface2{
    Integer add(Integer a,Integer b);
}

