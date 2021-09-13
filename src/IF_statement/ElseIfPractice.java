package IF_statement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        /*
        user will enter a number
        if a number fall 0 to 5 --> "your number is between 0-5"
        if a number fall 6 to 10 --> "your number is between 6-10"
        if a number fall 11 to 15 --> "your number is between 11-15"
        if a number fall 16 to 20 --> "your number is between 16-20"

 */
        Scanner scn= new Scanner(System.in);
        System.out.println("Please enter number between 0 to 20");
        int number = scn.nextInt();
        if (number>=0 && number<=5 ){
            System.out.println("your number is between 0-5");
        }
        else if (number>=6 && number<=10){
            System.out.println("your number is between 6-10");
        }
        else if(number>=11 && number<=15){
            System.out.println("your number is between 11-15");
        }
        else if (number>=16 && number<=20){
            System.out.println("your number is between 16-20");
        }else {
            System.out.println("You out of the range");
        }
    }
}
