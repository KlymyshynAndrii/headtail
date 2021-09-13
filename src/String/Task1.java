package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter string with space in front");
        String text= input.nextLine();
        text=text.trim();
        text= text.replace('a', '*');
        text=text.replace("e","**");
        text=text.toUpperCase();
        System.out.println(text);
        int indexOfStar=text.indexOf('*');
        System.out.println(indexOfStar);

        System.out.println(indexOfStar*10);

        int middleChar= (text.length()-1)/2;
        System.out.println(middleChar);




    }
}
