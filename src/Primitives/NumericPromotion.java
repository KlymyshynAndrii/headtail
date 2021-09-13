package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1=122;
        short sh1=30;
        // byte sum1= b1+sh1; not compile because of NumericPromotion
        int  sum1=b1+sh1; // JAVA promote smaller data type ( byte and short) to int data type

        float fl1= 2.3f;
        double db1=3.4;
        // float sum2=fl1+db1; compile error

        System.out.println(fl1+db1);
        double sum2=fl1+db1;
        System.out.println(sum2);

        //int product1= sum1*sum2; result is a decimal number
        double product1 = sum1*sum2;

        int i1=23;
        double db2=i1;

        //int i2 = db2;  not compile

        //long l1=db2;   not compile


    }
}
