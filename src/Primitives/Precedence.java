package Primitives;

public class Precedence {
    public static void main(String[] args) {
        int count=10+15;
        int count1= count+3*5;

        System.out.println(count); // 25
        System.out.println(count1); // 40

        int count2= count-count1/2*3;
        System.out.println(count2);
        int count3= 6/3*5%3;
        System.out.println(count3);
        int count4= 6-4-count+count3;
        System.out.println("count4 - "+count4 );
        System.out.println("total of count3 and count4"+(count3+count4));

        // 50 food, 250 electronic, 80 shoes
        //  10%         20%           15%
        //totalTax=(50*0.1) +  ( 250*0.2)      +  (80*0.15);
        //totalPayment=50+250+80+(50*0.1) +( 250*0.2)+  (80*0.15);;
        double payment=50+250+80+(50*0.1)+(250*0.2)+(80*0.15);
        System.out.println(payment);

        double number=(20*(0.1+500)*2+30)*0.7;
        System.out.println(number);

    }
}
