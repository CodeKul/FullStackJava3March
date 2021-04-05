package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

    int id;
    String name;

    public EmployeeList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {


        EmployeeList obj1 = new EmployeeList(1,"Sachin");
        EmployeeList obj2 = new EmployeeList(2,"gaurav");
        EmployeeList obj3 = new EmployeeList(3,"Ravi");

        List<EmployeeList> list = new ArrayList<>();

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        Collections.sort(list);
    }
}
