package control_statement;


import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {

        int i=17;
        String nationalty = "Indian";

        if(i>=18){
            if(nationalty=="Indian"){
                System.out.println("You can vote");
            }else {
                System.out.println("Not Indian");
            }
        }else {
            System.out.println("You can not vote");
        }


        int a = 100,b=20,c=3;

        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }


        int j = 1;
        if(j>0){
            System.out.println("positive");
        }else {
            System.out.println("nagative");
        }

        String s = j > 0 ? "Positive" : "negative";//ternary operator

        System.out.println(s);

    }
}
