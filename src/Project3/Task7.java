package Project3;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Using
scanner enter String (any two words) value
with spaces in the beginning and at the end.
In this input, the second word is not starting with the upper case,
using string methods change the letter with upper case and print it
Example 1:
Please enter the String with the following format “ word “
Natural black
The output is:
Natural Black
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the String with the following format word: /Natural black/");
        String text = input.nextLine().trim();
        String word1= text.substring(0, text.indexOf(' '));
        String word2 = text.substring(text.indexOf(' ', text.indexOf(text.length()))).trim();
        //System.out.println(word2.toUpperCase().charAt(0));
        System.out.println(word1+" "+word2.toUpperCase().charAt(0)+(word2.substring(1)));

    }

}
