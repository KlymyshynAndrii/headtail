package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// this is creation of scanner object
        // is ok to create anywhere you need bat better to crate when you start ( on top)

        System.out.println("Please enter your name");// input.next();
        String name = input.nextLine();// income value is name from privioce line

        System.out.println("Your name is "+name);
        System.out.println("Please, enter your last name");
        String lastName=input.nextLine();
        System.out.println("Your full name is "+name+" "+lastName);
        System.out.println("Please enter you age");
        int age= input.nextInt();
        System.out.println("Your age will be "+(age+10)+" in 10 years");
        int ageIn5Years=age+5;
        System.out.println("your age will be"+ageIn5Years+" in next 5 year");

        System.out.println("Please enter your city name");
        name+= input.nextLine();
        System.out.println(name);
    }
}
