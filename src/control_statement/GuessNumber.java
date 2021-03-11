package control_statement;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int number;
        int guess;
        int trials=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");

        number = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Enter the number");
            guess = scanner.nextInt();
            trials++;
            if (number > guess) {
                System.out.println("Number is high");
            } else if (number < guess) {
                System.out.println("Number is low");
            } else {
                System.out.println("You choose correct in trials" + trials);
            }

        } while (number != guess);

    }

}
