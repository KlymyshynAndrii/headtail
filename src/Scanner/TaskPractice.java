package Scanner;

import java.util.Scanner;

public class TaskPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Hi David, how much do you want to deposit?");
        double moneyLeft= 200;
        double deposit1= input.nextDouble();
        moneyLeft+=deposit1;
        System.out.println("On your account "+moneyLeft+"$");
        System.out.println("Hi David, how much do you want to deposit?");
        double deposit2= input.nextDouble();
        moneyLeft+=deposit2;
        System.out.println("On your account "+moneyLeft+"$");
        System.out.println("Hi David, how much do you want to deposit?");
        double deposit3= input.nextDouble();
        moneyLeft+=deposit3;
        System.out.println("On your account "+moneyLeft+"$");
        System.out.println("Hi David, how much do your phone cost?");
        double phone = input.nextDouble();
        moneyLeft-=phone;
        System.out.println("On your account "+moneyLeft+"$");
        System.out.println("Hi David, how much do your headphone cost?");
        double headPhone= input.nextDouble();
        moneyLeft-=headPhone;
        System.out.println("On your account "+moneyLeft+"$");




    }
}
