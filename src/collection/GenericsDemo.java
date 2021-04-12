package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printData(list);

        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("DotNet");
        
        printData(strings);

    }

    private static void printData(List<?> list) {

        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
