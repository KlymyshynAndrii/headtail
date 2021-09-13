package HomeWork6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year(4 digit number)");
        int year = input.nextInt();
        if (year%4==0){
            if(year%100==0){
                if(year%400==0){

                }
            }
            System.out.println("This is a Leap Year");
        }else {
            System.out.println("This is not Leap Year");
        }
    }
}
