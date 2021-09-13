package LOOPS;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        /*
        aks user to int num
        find and print the numbers which can divide given number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer number");
        int num = input.nextInt();
        int num1 = 1;

        while (num1<=num ){
            if((num%num1==0)) {
                System.out.println(num1);

            }
        num1++;
        }

    }
}
