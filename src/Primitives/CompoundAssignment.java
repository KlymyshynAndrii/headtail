package Primitives;

public class CompoundAssignment {
    public static void main(String[] args) {
        int carNumber= 7;
        carNumber=5+carNumber;
        System.out.println(carNumber);
        carNumber+=5;
        System.out.println(carNumber);
        carNumber/=2; //carNumber= carNumber/2
        System.out.println(carNumber);

        int count;
        count= carNumber*2;
        System.out.println(count);
        int count1;
        //count1+=10; it is not compile, count1 does not have value

        count -=carNumber;
        System.out.println(count);

        int payment=50;
        payment *= carNumber; // payment = payment*carNumber
        System.out.println(payment);

        int modulus= 1000;
        modulus %=payment; // first java divided 1000 by 400 and find the remainder , the assign the value for modulus remainder
        System.out.println(modulus);
    }
}
