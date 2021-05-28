package java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("R");
        stringJoiner.add("A");
        stringJoiner.add("H");
        stringJoiner.add("U");
        stringJoiner.add("L");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner(",","[","]");
        stringJoiner1.add("Wer");
        stringJoiner1.add("q");
        System.out.println(stringJoiner1);

        StringJoiner merge = stringJoiner.merge(stringJoiner1);
        System.out.println(merge);

        System.out.println();

        StringJoiner stringJoiner2 = new StringJoiner(",");
        stringJoiner2.setEmptyValue("Empty");
        System.out.println(stringJoiner2);
    }
}
