package SWITCH;

import java.util.Scanner;

public class NestedSWITCH {
    public static void main(String[] args) {
        /*
        calling to company
        there are three department IT-1, HR-2, REP-3
        in IT: Raj, Alex, Jessi
        in HR: Ana, Tima
        in REP: Jeremiah, John, David
            ask which dept they want to talk
             ask whom they want to talk

         */
        Scanner input = new Scanner(System.in);
        System.out.println( "What department you want to talk? 1-IT 2-HR 3-REP");
        int department = input.nextInt();
            switch (department){
                case 1:
                    input = new Scanner(System.in);
                    System.out.println("Who do you want to talk with? Raj, Alex, Jessi");
                    String name= input.nextLine();
                    switch (name.toLowerCase()){
                        case "raj":
                            System.out.println("Transferring to Raj");
                            break;
                        case "alex":
                            System.out.println("Transferring to Alex");
                            break;
                        case "jessi":
                            System.out.println("Transferring to Jessi");
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 2:
                    input = new Scanner(System.in);
                    System.out.println("Who do you want to talk with? Ana, Tima");
                    String hrName = input.nextLine().toLowerCase().trim();
                    switch (hrName){
                        case "ana":
                            System.out.println("Transferring to Ana");
                            break;
                            case "toma":
                                System.out.println("Transferring to Tima");
                                break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 3:
                    input = new Scanner(System.in);
                    System.out.println("Who do you want to talk with? Jeremiah, John, David");
                    String repName= input.nextLine().toUpperCase().trim();
                    switch (repName){
                        case "JEREMIAH":
                            System.out.println("Transferring to Jeremiah");
                            break;
                        case "JOHN":
                            System.out.println("Transferring to John");
                            break;
                        case "DAVID":
                            System.out.println("Transferring to David");
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid");
                    break;


        }

    }
}
