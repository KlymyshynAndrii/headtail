package Project3;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 words/sentences and press enter after each one");
        String str1= input.nextLine();
        String str2= input.nextLine();
        String str3= input.nextLine();

        String str1Letter= str1.substring(0);
        String str2Letter= str2.substring(0);
        String str3Letter= str3.substring(0);

       // char firstLetter1 = str1.charAt(0);
      // char firstLetter2 = str2.charAt(0);
      //  char firstLetter3 = str3.charAt(0);

        boolean length = str1.length()==str2.length()&& str2.length()==str3.length();
        boolean hasJava = str1.toUpperCase().contains("JAVA")&&str2.toUpperCase().contains("JAVA")&&str3.toUpperCase().contains("JAVA");
        boolean startUpper = str1.startsWith(str1Letter)&&str2.startsWith(str2Letter)&&str3.startsWith(str3Letter);
        if (length&&hasJava&&startUpper){
         System.out.println(length&&hasJava&&startUpper);
}
       else{ System.out.println(length&&hasJava&&startUpper);}
    }
}
