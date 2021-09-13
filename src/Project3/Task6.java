package Project3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
/*
Using a scanner enter three different ingredients for the product
on the same line. Then ask the user to enter any int number.
Change the first letter of the ingredients starting from the entered number.
(Ingredients should start with different letters. Please read the example carefully )
Example 1:
Please enter three ingredients with spaces:
Milk Peanuts Butter
Please enter the int number:
5
The output is:
5ilk 6eanuts 7utter
Example 2:
Please enter three ingredients with spaces:
Sugar Cocoa Oil
Please enter the int number:
3
The output is:
3ugar 4ocoa 5il
Description
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter three ingredients with space");
        String ingredients= input.nextLine().trim();
        System.out.println("Please enter the int number");
        int num1= input.nextInt();
        int num2=num1+1, num3=num1+2;
        String wN1=""+num1, wN2=""+num2, wN3=""+num3;
       // System.out.println(""wN1+ wN2+wN3);

        String word1= ingredients.substring(1,ingredients.indexOf(' '));
        String word2= ingredients.substring(ingredients.indexOf(' ')+2,ingredients.indexOf
                (' ', ingredients.indexOf(' ')+1));
        String word3= ingredients.substring((ingredients.indexOf(' ',ingredients.indexOf(' ')+1))+2);

        System.out.println(wN1+word1+" "+wN2+word2+" "+wN3+word3);
            }
}
