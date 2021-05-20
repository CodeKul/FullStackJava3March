package java8;

public class MethodRefStatic {

    public static void main(String[] args) {
        //Method ref to static method
        MyInterface6 myInterface6 = MethodRefStatic::msg;
        //calling function of functional interface
        myInterface6.sample();
    }

    private static void msg(){
        System.out.println("In Msg");
    }
}

@FunctionalInterface
interface MyInterface6{
    void sample();
}
