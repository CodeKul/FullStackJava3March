package this_keyword;

import java.io.FileNotFoundException;

public class ThisDemo {

//instance
    int id;
    String name;
    String address;

//    public ThisDemo(){
//        System.out.println("In Constructor");
//    }

    public void show(){
        System.out.println("show method");
    }

    public void show1(){
        this.show();
    }

    public ThisDemo(int id,String name,String address){//local

        this.id = id;
        this.name= name;
        this.address = address;
    }

    private void print(){
        System.out.println("Id=>"+id+" " +" name =>"+name);
    }

    public static void main(String[] args) {

        ThisDemo thisDemo = new ThisDemo(1,"abc","Pune");
        thisDemo.print();
    }


}
