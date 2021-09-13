package HomeWork6;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter any String value. If this String
        has the color like red or blue with lower case print the red or blue.
EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter string value");
        String word= input.nextLine();

        if (word.contains("r")&&word.contains("e")&&word.contains("d")){
            System.out.println("red");
        }
        else if (word.contains("b")&&word.contains("l")&&word.contains("u")&&word.contains("e")){
            System.out.println("blue");
        }
        else {
            System.out.println("Your string does not contain color like 'red' or 'blue' with lower case letter");
        }

    }
}
