package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public static void main(String[] args) {
        ComparatorDemo obj1 = new ComparatorDemo(1, "Sachin", "Pune");
        ComparatorDemo obj2 = new ComparatorDemo(2, "Ravindra", "Nashik");
        ComparatorDemo obj3 = new ComparatorDemo(3, "Akash", "Mumbai");
        ComparatorDemo obj4 = new ComparatorDemo(4, "Gaurav", "Pune");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Comparator<ComparatorDemo> comparatorId = (comparatorDemo, t1) -> {
            if (comparatorDemo.id == t1.id) {
                return 0;
            } else if (comparatorDemo.id > t1.id) {
                return 1;
            } else {
                return -1;
            }
        };

        Comparator<ComparatorDemo> comparatorName = ( comparatorDemo,  t1) -> {
            return comparatorDemo.name.compareTo(t1.name);
        };

        Collections.sort(list, comparatorId.thenComparing(comparatorName));

        list.forEach(s -> {
            System.out.println("Id=>" + s.id + " Name=>" + s.name + " Address=>" + s.address);
        });

    }
}
