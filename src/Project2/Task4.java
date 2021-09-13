package Project2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter six digit number and press ENTER");


            int number = input.nextInt();
        if (number <=999999 || number >=000001) {
            int dg1 = number % 10;
            number = number / 10;

            int dg2 = number % 10;
            number = number / 10;

            int dg3 = number % 10;
            number = number / 10;

            int dg4 = number % 10;
            number = number / 10;

            int dg5 = number % 10;
            number = number / 10;

            int dg6 = number % 10;
            int sum = dg1 + dg2 + dg3 + dg4 + dg5 + dg6;
            int mult = dg1 * dg2 * dg3 * dg4 * dg5 * dg6;
            System.out.println("Multiplication of all digits is " + mult);
            System.out.println("Sum of all digits id " + sum);
        }
        System.out.println("You enter to much or less digit, please try one more time ");
        }
}
