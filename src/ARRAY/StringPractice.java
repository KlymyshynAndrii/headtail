package ARRAY;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String[] studentName= new String[6];

        studentName[5]="Zolie";
        studentName[2]="Sorin";
        studentName[3]="Sorin";
        studentName[4]="Adel";

        System.out.println(Arrays.toString(studentName));

        studentName[4]= "David";
        System.out.println(Arrays.toString(studentName));

        for (int i=0; i<studentName.length;i++){
            System.out.print(studentName[i]+", ");
        }

    }
}
