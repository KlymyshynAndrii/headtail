package IF_statement;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        /*
        ask user for city name
        if city name is Chicago, ask user what is school name
        if school name is Techtorial
        print -- you are luck to be on B10
        if not -- Please come and visit us
        if the city is not Chicago
        print -- please come to Chicago
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter you city name");
        String cityName = input.next();
        if (cityName.equalsIgnoreCase("Chicago")){
            System.out.println("What is your school name");
            String schoolName= input.next();
            if (schoolName.equalsIgnoreCase("Thectorial")){
                System.out.println("You are one of the heros");
            }else{
                System.out.println("Please visit Techtorial");
            }

        }else {
            System.out.println("Please come to Chicago");
        }


    }
}
