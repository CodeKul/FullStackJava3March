package java8;

import java.util.function.BiFunction;

public class MethodRefConst {

    public static void main(String[] args) {
        //method refer to constructor
        MyInterface7 myInterface7 = Hello::new;
        //calling function of functional interface
        myInterface7.hello();

        //Functional interface and it contain on method apply
        BiFunction<Integer,Double,Double> addition = MyInterface8::add;
        Double i = addition.apply(1,10.00);
        System.out.println(i);
    }
}
class Hello{
    public Hello(){
        System.out.println("In Cont");
    }
}

@FunctionalInterface
interface MyInterface7{
   Hello hello();
}

interface MyInterface8{

    static Double add(Integer i,Double j){
        return i+j;
    }
}