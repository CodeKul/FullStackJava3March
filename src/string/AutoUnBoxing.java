package string;

public class AutoUnBoxing {

    public static void main(String[] args) {

        int i=10;

        Integer integer = new Integer(i);//autoboxing

        System.out.println(integer);

        float f  = 1.7f;

        int k = (int)f;//type casting

        System.out.println(k);

        long l = (long)i;


        Integer integer1 = new Integer(80);

        int j = integer1;//unboxing

        System.out.println(j);

    }
}
