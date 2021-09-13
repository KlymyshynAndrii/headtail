package Primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        // 123 find the sum of digits from giving number

        // 1+2+3=6 --> print "the sum of digits = 6"
        int number = 906;

        int firsDigit= number%10;
        System.out.println("first digit or first remainder: " +firsDigit);

        number=number/10;

        int secondDigit= number%10;
        number= number/10;
        int thirdDigit= number%10;
        System.out.println( "The sum is ="+(firsDigit+secondDigit+thirdDigit));

    }
}
