package LOOPS;

import java.util.Locale;

public class WhilePractice6 {
    public static void main(String[] args) {
        // Summer  ---> print out every letter from this word one by one

        String text = "Summer";
        int index=0;

       while (index<text.length()) {

           System.out.print(text.charAt(index)+", ");
index++;
       }
    }
}
