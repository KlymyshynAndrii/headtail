package HomeWork7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of eggs in your fridge");
        int eggs = input.nextInt();
        while (eggs>0 ){
            System.out.println("How much eegs did you eat today");
            int eatenEeg = input.nextInt();
            if (eatenEeg<=eggs){
                eggs-=eatenEeg;
                System.out.println("There are "+eggs+" eggs left");
            }else {
                System.out.println("You can not eat so much egg." +
                        " Please buy some eggs before you want to eat them");
            }

        } System.out.println("You are eat all eggs.");
    }
}
