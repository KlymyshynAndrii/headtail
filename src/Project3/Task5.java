package Project3;

import java.util.Scanner;
/*
Using the scanner asks the user to enter one sentence with three words
and print the index number of each word's last character
and then print the sum of each index number that you found.
For Example:
Input:
"Importance of Human" --> it can be any three-word sentence.
Output:
9 --> index number of 'e'
12 --> index number of 'f'
18 --> index number of 'n'
The sum: 39
De
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter 3 words sentence");
        String sentence= input.nextLine();
        int firstWordIndex=sentence.indexOf(' ')-1;
        int secondWordIndex=sentence.indexOf(' ', sentence.indexOf(' ')+1)-1;
        int thirdWordIndex=sentence.length()-1;
        char firstChar=sentence.charAt(firstWordIndex);
        char secondChar=sentence.charAt(secondWordIndex);
        char thirdChar = sentence.charAt(thirdWordIndex);
        System.out.println(firstWordIndex+"--> index number of "+firstChar);
        System.out.println(secondWordIndex+"--> index number of "+secondChar);
        System.out.println(thirdWordIndex+"--> index number of "+thirdChar);
        System.out.println("The sum:"+(firstWordIndex+secondWordIndex+thirdWordIndex));
    }
}
