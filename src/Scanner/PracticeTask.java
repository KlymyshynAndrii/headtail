package Scanner;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        /*
        ask user to provide their high and weight and
        calculate their BMI
        BMI= weight/(height*height)
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter you weight in KG");
        double weight= input.nextDouble();

        System.out.println("Please enter your height in meter");
        double height= input.nextDouble();

        System.out.println("Your BMI is "+(int)(weight/(height*height)));

        }
    }

