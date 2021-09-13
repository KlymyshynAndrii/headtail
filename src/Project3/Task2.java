package Project3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string value");
        String firstInput= input.next();
        System.out.println("Please enter a number");
        int startingNum= input.nextInt();
        System.out.println("Please enter a number");
        int finishNum= input.nextInt();
        String between= firstInput.substring(startingNum-1,finishNum);
        System.out.println(between);
    }
}
