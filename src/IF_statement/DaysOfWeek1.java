package IF_statement;

import java.util.Scanner;

public class DaysOfWeek1 {
    public static void main(String[] args) {
        /*
        ask user enter first letter of the day

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first letter of day");
        String day = input.nextLine();
        if (day.equalsIgnoreCase("M")) {
            System.out.println("Monday");
        }
        if (day.equalsIgnoreCase("t")) {
            System.out.println("Tuesday or Thursday");
        }
        if (day.equalsIgnoreCase("w")) {
            System.out.println("Wednesday");
        }
        if (day.equalsIgnoreCase("F")) {
            System.out.println("Friday");
        }
        if (day.equalsIgnoreCase("s")) {
            System.out.println("Saturday or Sunday");
        }
        else  {
            System.out.println("Your entry is not valid, the is not day start with that char");
        }
    }
}
