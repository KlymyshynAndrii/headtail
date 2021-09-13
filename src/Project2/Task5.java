package Project2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digit number");
        int num = input.nextInt();
        if (num <= 99999 && num >= 10000) {
            int dg1 = num % 10;
            num = num / 10;
            int dg2 = num % 10;
            num = num / 10;
            int dg3 = num % 10;
            num = num / 10;
            int dg4 = num % 10;
            num = num / 10;
            int dg5 = num;
            System.out.println("" + dg1 + dg2 + dg3 + dg4 + dg5);


        }
    }
}