package LOOPS;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        user has 100$
        as long as user has balance more than 0$
        ask user that how much money user want to spend
            if the amount is less than balance
                update the balance and show the user
            if amount is more than balance
                "you don't have enough money on your account"
         */
    double balance=100;
        while (balance>0){
        Scanner input =new Scanner(System.in);
        System.out.println("How much money do you want to spend");
        double spend= input.nextDouble();
        if (spend<=balance) {
            balance-=spend;
            System.out.println("Your balance is "+balance);
            }
        else {
            System.out.println("You don't have enough money on your account! Your balance is "+balance);
        }
        }
    }
}
