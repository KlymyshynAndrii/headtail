package LOOPS;

import java.util.Scanner;

public class TaskFORLOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive num less then 10");
        int num= input.nextInt();

        for (  ;num<=10 ;num++){

            System.out.println(num);

        }
    }
}
