package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        // find the product by giving number
        // print the result as following
        // "The product is..."
        int num=1234;
        int n1=num%10; // this is first digit

        num=num/10;

        int n2=num%10;

        num=num/10;

        int n3=num%10;

        num=num/10;

        int n4=num%10;

        int product=n1*n2*n3*n4;

        System.out.println("The product is "+product);


    }
}
