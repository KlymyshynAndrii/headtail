package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
         /*
        ask user how many names of people they want to store
        - get name from user to save
        - store those name in a string Array
        - print those using toString method
        - if the name has more than 5 letter save it to long array
        - if less than 5 store to short array
         */
        Scanner input = new Scanner(System.in);
        int stud= input.nextInt();
        input.nextLine();
        //System.out.println();
        String[] longNames = new String[stud];
        String shortNames[]=new String[stud];
        for (int i=0; i<stud;i++){
            System.out.println("Enter a name, please");
            String name = input.next();
            if (name.length() >=5 ){
           longNames[i]=name;
        }else {
                shortNames[i]=name;
            }
    }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
    }
}
