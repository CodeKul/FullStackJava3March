package exception_handling;

public class ExceptionDemo {

    public static void main(String[] args) {

        int i = 10;

        try {
//            int j = i / 0;
//            System.out.println(j);
//
//            String s = null;
//            System.out.println(s.length());

            int[] arr = new int[3];
            arr[4]= 9;

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }


        System.out.println("Hii");
        System.out.println("Hello");

    }
}
