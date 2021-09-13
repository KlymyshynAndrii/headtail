package HomeWork6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter to String value and concatenate them
        together then print the result. If both String length is not same then omit
        chars from the longer string so it is the same length as the shorter string.
        After making both string same length then concatenate it.
EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhon"
EXAMPLE-2:
String 1: "Cable"
String 2: "Mic"
Output: "CabMic"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter one word");
        String word1= input.nextLine();
        System.out.println("Please, enter one more word");
        String word2= input.nextLine();

        if ( word1.length()>word2.length()){
            word1=word1.substring(0, word2.length());

            System.out.println(word1+word2);
        }
        else if ( word1.length()-1<word2.length()-1){
            word2=word2.substring(0, word1.length());

            System.out.println(word1+word2);
        }

    }
}
