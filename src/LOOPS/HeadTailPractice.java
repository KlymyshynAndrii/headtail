package LOOPS;

import java.util.Random;
import java.util.Scanner;

public class HeadTailPractice {
    public static void main(String[] args) {
        Random number = new Random();
        //int a = number.nextInt(2);○○
        Scanner input = new Scanner(System.in);

        String answer;

        do {
            System.out.println("Game is started, MAKE A GUESS! HEAD/TAIL");
            String guess = input.next();
            int a = number.nextInt(2);

            String flip = a == 0 ? "Head" : "Tail";
            if (guess.equalsIgnoreCase(flip)) {
                System.out.println("You are lucky, it is your day today");
            } else {
                System.out.println("Sorry, that was not correct choice");
            }
             System.out.println("Do you want to play again");
            answer = input.next();
        } while (answer.equalsIgnoreCase("y"));
        System.out.println("Its ok see you next time");

    }
}
