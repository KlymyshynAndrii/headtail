package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        /*
        ask user how many names of people they want to store
        - get name from user to save
        - store those name in a string Array
        - print those using toString method
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter how many student name you want to store");
        int stCount= input.nextInt();
        input.nextLine();
        String[] names= new String[stCount];
        for (int i=0; i<stCount; i++){
            System.out.println("Please enter a name");
            names[i]= input.nextLine();

        }
        System.out.println(Arrays.toString(names));



    }
}
