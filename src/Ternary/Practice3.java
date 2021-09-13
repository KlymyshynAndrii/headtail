package Ternary;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lastName= input.nextLine().toUpperCase();
        String print = lastName.charAt(0)>='A' && lastName.charAt(0)<= 'K'  ?
        lastName+" most popular last name" : lastName+" well know last name";
        System.out.println(print);
    }
}
