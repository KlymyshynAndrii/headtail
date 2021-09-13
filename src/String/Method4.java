package String;

import java.util.Locale;

public class Method4 {
    public static void main(String[] args) {

        String a="John";
        String b= "John";
        boolean bl1= a.equals(b);
        System.out.println(bl1);
        boolean bl2=a.equals("John");
        System.out.println(bl2 );

        String c= "JOHN";

        boolean bl3=a.equals(c);
        System.out.println(bl3);

        //===================================
        //equalsIgnoreCase() --
        boolean bl4=a.equalsIgnoreCase(c);// true
        System.out.println(bl4);
        System.out.println("Java is".equalsIgnoreCase("JAVA is"));// true
        System.out.println("Java is cool".equalsIgnoreCase("JAVA is"));// true

        String str1 = "Java is cool";
        // replace(); it will replace original with new one
        str1=str1.replace('o','$');
        System.out.println(str1);

        str1=str1.replace("c$$l","easy");
        System.out.println(str1);
        String text1= "Tava";
        str1=str1.replace("Java",text1);
        System.out.println(str1);

        System.out.println(str1.replace("***","???"));

        String star = "Star of the day is *";
        System.out.println(star.replace("*","!!!"));

        //  trim();=================================

        String text2= "       It is Saturday   ";
        System.out.println(text2);
        text2=text2.trim();
        System.out.println(text2);

        // "Do whatever it takes"
        /*
        concat with "to lear Java"
        make everything toUpperCase
        replace "Java" with "JOB"
        check if the text contains "Chicago"
         */


        String words=  "Do whatever it takes";
        words=words.concat(" to learn Java");
        System.out.println(words);
        words=words.toUpperCase();
        System.out.println(words);
        words= words.replace("JAVA", "JOB");
                words=words.replace("LEARN", "GET");
        System.out.println(words);
        System.out.println("Does it contain Chicago-->"+(words.contains("Chicago")));




    }
}
