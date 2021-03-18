package exception_handling;

import javax.xml.catalog.Catalog;

public class NestedTry {

    public static void main(String[] args) {

        int i = 10;

        try {
            int j = i / 0;

//            try{
//                String s = null;
//                System.out.println(s.length());
//            }catch (NullPointerException e){
//                System.out.println("Inside try=>"+e);
//            }
//
//            try{
//                String s = null;
//                System.out.println(s.length());
//            }catch (NullPointerException e){
//                System.out.println("Inside try=>"+e);
//            }
        } catch (NullPointerException e) {
            System.out.println("Nullpointer=>" + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithematic=>" + e);
        }catch (Exception e){
            System.out.println(e);
        }


        finally {
            System.out.println("Finally Bye");
        }


    }
}
