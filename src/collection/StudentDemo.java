package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo implements Comparable<StudentDemo>{

    int id;
    String name;
    String address;

    public StudentDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        StudentDemo obj1 = new StudentDemo(1,"Sachin","Pune");
        StudentDemo obj2 = new StudentDemo(2,"Ravindra","Nashik");
        StudentDemo obj3 = new StudentDemo(3,"Akash","Mumbai");
        StudentDemo obj4 = new StudentDemo(4,"Gaurav","Pune");

        List<StudentDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Collections.sort(list);

        list.forEach(s->{
            System.out.println("Id=>"+s.id+" Name=>"+s.name+" Address=>"+s.address);
        });

    }

    @Override
    public int compareTo(StudentDemo studentDemo) {
        return this.name.compareTo(studentDemo.name);
    }

//    @Override
//    public int compareTo(StudentDemo studentDemo) {
//        if(this.id ==studentDemo.id){
//            return 0;
//        }else if(this.id>studentDemo.id ){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}
