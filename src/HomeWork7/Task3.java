package HomeWork7;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a string");
        String word = input.nextLine().toLowerCase();
        int a = 0;
        while (a < word.length()) {
            if (word.charAt(a)== 'd' && word.charAt(a+2)=='d') {
               // if (word.charAt(a+2)=='d'){
                    System.out.println("dad");
               // }
            }
            a++;
        }
    }
}
