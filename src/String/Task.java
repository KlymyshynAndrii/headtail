package String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some Strings");
        String str= input.nextLine();

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.indexOf('c',str.indexOf("c")+1));
       // System.out.println(str.indexOf("c", str.indexOf("c")+1));// second matching lover case "c"

        System.out.println(str.length());

        System.out.println(str.indexOf("x"));

    }
}
