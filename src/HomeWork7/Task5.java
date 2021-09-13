package HomeWork7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int time=0;
        int increase=10;
        System.out.println("Please enter your current speed");
        int current= input.nextInt();
        System.out.println("Please enter your target speed");
        int target= input.nextInt();
        while (current<target){
            current+=increase;
            time++;
        }
        System.out.println("You need "+time+" sec to reach target speed");



    }

}
