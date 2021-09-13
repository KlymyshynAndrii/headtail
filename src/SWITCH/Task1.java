package SWITCH;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user to provide a number between 1 to 7
        print the matching name of the day for that number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7");
        int num = input.nextInt();
        switch (num){
            default:
                System.out.println("Invalid");
                break;
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
        }
    }
}
