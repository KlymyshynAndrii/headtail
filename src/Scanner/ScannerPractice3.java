package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName= scanner.nextLine();
        System.out.println("your entered this value -->"+fullName);

        System.out.println("What is your state");
        char firstLetter=scanner.next().charAt(0);// indexing
                                                  // I l l i n o i s --> letter count is 8
                                                  // 0 1 2 3 4 5 6 7 --> index number
        System.out.println(firstLetter);
        System.out.println();

    }
}

