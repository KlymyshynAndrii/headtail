package Project2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Hello! Please put the amount of money do you have like dollar.cent and press ENTER");
        double total = money.nextDouble();
        double totalInPennies= total*100;
        int totalInPennies1= (int) totalInPennies;
        int quarters=25, dimes=10, nickels=5, penni=1;

        int numOfQuarters=totalInPennies1/quarters;
        int remainderFromQuarters= totalInPennies1%quarters;
        int numOfDime= remainderFromQuarters/dimes;
        int remainderFromDimes=remainderFromQuarters%dimes;
        int numOfNickels= remainderFromDimes/nickels;
        int remainderOfNickels=remainderFromDimes%nickels;
        int numOfPennies= remainderOfNickels;
        System.out.println(" Here is your");
        System.out.println("Quarters "+numOfQuarters+" Dimes "+numOfDime+" Nickels "+numOfNickels+" Pennies "+numOfPennies);

    }
}
