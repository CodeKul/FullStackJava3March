package java8;

import java.util.Arrays;
import java.util.Comparator;

public class ArbitraryDemo {
//Method ref to instance method of arbitrary object of particular type
    public static void main(String[] args) {

        String[] arr = {"array","in","java"};

        Comparator<String> comparator =new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        };

        Arrays.sort(arr,String::compareToIgnoreCase);
        for (String str:arr) {
            System.out.println(str);
        }

        AddTwoDigits addTwoDigits  = Integer::sum;
        System.out.println(addTwoDigits.add(2,3));
    }
}

interface AddTwoDigits{
    Integer add(int i,int j);
}