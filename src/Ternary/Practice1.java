package Ternary;

public class Practice1 {
    public static void main(String[] args) {
        int num1=5;
        int num2=5;
        int num3=6;
        int resalt1=num1==num2 ? 25:30;
        System.out.println("Result 1 is "+resalt1);
        String result2=num1==num3 ? "Hello":"bye";
        System.out.println("Result 2 is "+result2);
        System.out.println(num1==num2 ? "Good morning": 5);
        int r3= num1==num3 ? num1+++num2 : num3+++num3;
        System.out.println(r3);
    }
}
