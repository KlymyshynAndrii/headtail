package HomeWork7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer number");
        int a = input.nextInt();
        int b = 1;

        while (b <= 10) {
            System.out.println("" + a + "*" + b + "=" + a * b);
            b++;
        }
    }
}
