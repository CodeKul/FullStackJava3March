package final_keyword;

public  class FinalKeyWordDemo {//final class -> can not inherits

    final int i=10; //final variable

    public final void show(){ //final method -> can not override
//        i = 18;
        System.out.println(i);
    }

    public static void main(String[] args) {
        FinalKeyWordDemo obj = new FinalKeyWordDemo();
        obj.show();

    }
}

class FinalDemo extends FinalKeyWordDemo{

//    @Override
//    public void show() {
//        System.out.println("In show");
//    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.show();
    }
}