package HomeWork7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string");
        String text= scan.nextLine();
        int index = 0;
        String newText="";
        String aText="";
        while (index<text.length()){

            newText=text.substring(index);
            aText+="a";

            System.out.println(aText+newText.substring(1));
         index++;
        }
    }
}
