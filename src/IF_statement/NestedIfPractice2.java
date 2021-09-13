package IF_statement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please answer 'yes' or 'no'");
        System.out.println("Do you know JAVA");
        String knowJava= scanner.nextLine();
        if (knowJava.equalsIgnoreCase("yes")){
            System.out.println("Do you know Selenium");
            String knowSelenium= scanner.nextLine();
            if(knowSelenium.equalsIgnoreCase("yes")){
                System.out.println("Do you know API testing");
                String knowAPI= scanner.nextLine();
                if (knowAPI.equalsIgnoreCase("yes")){
                    System.out.println("Do you know SQL");
                    String knowSQL= scanner.nextLine();
                    if (knowSQL.equalsIgnoreCase("yes")){
                        System.out.println("CONGRADULATION");
                    }else{
                        System.out.println("We need SQL");
                    }
                }else {
                    System.out.println("We need Selenium");
                }
            }else {
                System.out.println("We need Selenium");
            }
        }else {
            System.out.println("we need JAVA ");
        }


    }
}
