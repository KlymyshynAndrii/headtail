package IF_statement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {
        /*
        ask user to enter an integer value
        print number if it even
        otherwise print "odd number"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer value");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("Your number is even");
    }
        else {
            System.out.println("Your number is odd");
        }
    }
}
