package IF_statement;

import java.util.Scanner;

public class ElseIfTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first exam score from 0 to 100");
        int score1= input.nextInt();
        System.out.println("Please enter your second exam score from 0 to 100");
        int score2= input.nextInt();
        System.out.println("Please enter your third exam score from 0 to 100");
        int score3= input.nextInt();
        int average=(score1+score2+score3)/3;
        if (average>=90 && average<=100){
            System.out.println("your average score is "+average+" and letter grade is A");
        }else if(average>=80 && average<90){
            System.out.println("your average score is "+average+" and letter grade is B");
        }else if(average>=70 && average<80){
            System.out.println("your average score is "+average+" and letter grade is C");
        }else if (average>=60 && average<70) {
            System.out.println("your average score is "+average+" and letter grade is D");
        }else if (average<60) {
            System.out.println("you need to take class again");
        }
    }
}
