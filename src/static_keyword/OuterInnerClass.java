package static_keyword;

public class OuterInnerClass {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();


        Outer.Inner inner = outer.new Inner();

//        Outer.Inner inner1 = new Outer.Inner();  //static call
//        inner1.show();
        inner.show();
    }
}


class Outer {
    int i = 20;

    public void show() {
        System.out.println(i);
    }

    //static
     class Inner {
        int i = 10;

        public void show() {
            System.out.println(i);
        }
    }
}