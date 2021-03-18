package control_statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest {


    public static void main(String[] args) {
        List<String> arr = Arrays.asList("work","is","worship");

        int longest = 0;
        String str = "";

        for(String s : arr){

            if(s.length()>longest){
                longest = s.length();
                str = s;
            }
        }

        System.out.println(str);
    }
}
