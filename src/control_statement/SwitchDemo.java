package control_statement;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        int num1;
        int num2;
        char operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        System.out.println("Enter operator");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Invalid operator");


        }
    }
}
