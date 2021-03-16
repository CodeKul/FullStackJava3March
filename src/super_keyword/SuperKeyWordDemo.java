package super_keyword;

public class SuperKeyWordDemo {

    public static void main(String[] args) {

        B b =  new B();

    }
}

class A{
    int i=10;

    A(){
        System.out.println("In const A");
    }

    A(int i){
        System.out.println("In Parameter const");
    }

}

class B extends A{

    B(){
        super(8);
        System.out.println("In B const");
    }

    B(int i){

        System.out.println("In Parameter B");
    }

//    int i=18;
//
//    public void show(){
//        System.out.println(super.i);
//
//    }
}