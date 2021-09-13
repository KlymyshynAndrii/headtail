package Primitives;

public class ModulusPractice {
    public static void main(String[] args) {
        // arithmetic operators are +, -, *, /, %(modulus)
        // % (modulus will give the remainder of division)

        int studentCount=9;
        int divisor= 2;
        int resultOfDivision;
        resultOfDivision=studentCount/divisor;
        System.out.println("the result is -->"+resultOfDivision);
        int remainder= studentCount%divisor;
        System.out.println("The remainder is -->"+remainder);

        // % --> modulus

        int x=15; //I want to divide 15 by 6 and find the remainder --> 3

        int result= x%6; // 15/6=2, R-->3
        System.out.println(result);



    }
}
