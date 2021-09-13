package HomeWork6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Given a string, if a length 2 substring appears at both its
        beginning and end, print a string without the substring at the
        beginning, so "HelloHe" yields "lloHe". The substring may overlap
        with itself, so "Hi" yields "". Otherwise, print the original string unchanged.
Example:
"TestTe" --> print stTe
"TestTi" --> print TestTi
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String text = input.nextLine();
        if (text.charAt(0)==text.charAt(text.length()-2) && text.charAt(1)==text.charAt(text.length()-1)){
            System.out.println(text.substring(2));
        }
        else{
            System.out.println(text);
        }

    }
}
