package LOOPS;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num1 = input.nextInt();
        int num=1;

        while(num<11){
            System.out.println(num+"*"+num1+"="+num*num1);
             num++;
        }


    }
}
