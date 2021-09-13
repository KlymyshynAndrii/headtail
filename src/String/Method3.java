package String;

import java.util.Locale;

public class Method3 {
    public static void main(String[] args) {

        String string="Selenium";

        // toUpperCase(); will convert to upper case

        string = string.toUpperCase();
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string);
        string = string.toLowerCase();
        String a = "" +string.charAt(0);
        a = a.toUpperCase();
        System.out.println(a);
        System.out.println(a+string);

        // startsWith();=======================

        String word = "do whatever it takes";

        System.out.println(word.startsWith("do")); // -- true
       boolean result1= word.startsWith("what");
        System.out.println(result1);// -- false
        System.out.println(word.startsWith("d"));// -- true
        boolean result2=word.startsWith("do w");
        System.out.println(result2);// --true
        System.out.println(word.startsWith("Do"));// -- false

        //endsWith();==============================

        word.endsWith("do");
        System.out.println(word.endsWith("s")); // true
        System.out.println(word.endsWith("es")); //true
        System.out.println(word.endsWith("takes")); //true
        System.out.println(word.endsWith("takeS")); //false because upper case S and it not maching

        String text = "Techtorial";

        System.out.println(text.contains("t"));
        text = text +word;
        System.out.println(text.contains("do"));// true

        System.out.println(text.contains("for")); // false

        System.out.println(text.contains("i")); //true



    }
}

