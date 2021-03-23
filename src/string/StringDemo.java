package string;

public class StringDemo {

    public static void main(String[] args) {

        char[] arr = {'c','o','d','e'};

        String charArr = new String(arr);

        System.out.println(charArr);

        String s = "java";

        s = s.concat("language");
        System.out.println(s);

    }
}
