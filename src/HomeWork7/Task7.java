package HomeWork7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i=0;
        do{
        String username = "askMe123";
        String password = "ask123";
        System.out.println("Please enter username");
        String username1 = input.nextLine();
        System.out.println("Please enter password");
        String password1 = input.nextLine();

            if (username1.equals(username)  && password1.equals(password)) {
                 System.out.println("Welcome in your account");
                break;
             }
            else {
                System.out.println("Your user name or password is incorrect");
                }
        }while (i!=0);
    }
}
