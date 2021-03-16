package static_keyword;

public class StaticKeyWordDemo {

    static String companyName;
    static {
        System.out.println("In static block");
        companyName = "ABC";
    }

    static {
        companyName = "Dmart";
    }
    int id;
    String name;


    public static void show(){
        System.out.println("In static method");
    }

    public static void main(String[] args) {
        StaticKeyWordDemo obj1 = new StaticKeyWordDemo();
        obj1.id = 1;
        obj1.name = "Sagar";

        StaticKeyWordDemo obj2 = new StaticKeyWordDemo();
        obj2.id = 2;
        obj2.name = "Suhas";


        System.out.println("Id=>" + obj1.id + " name=>" + obj1.name + " companyName=>" + StaticKeyWordDemo.companyName);
        System.out.println("Id=>" + obj2.id + " name=>" + obj2.name + " companyName=>" + StaticKeyWordDemo.companyName);;
    }
}

class StaticDemo{

    public static void main(String[] args) {
        StaticKeyWordDemo.show();
    }
}
