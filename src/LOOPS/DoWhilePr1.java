package LOOPS;

public class DoWhilePr1 {
    public static void main(String[] args) {
        int num=10;
 //       while(num>=0){
 //         System.out.println(num--);
 //   }
        do{
            System.out.println(num--);
        }while (num>=0);
num=10;
        do{
            System.out.println(num--);
        }while (num<0);
        //find the sum of num from 10 to 15
        // print res as "The total is"


        int total = 0;
        int num1=10;
        do {total= total+ num1;
            num1++;

            //System.out.println("The total is "+ (num+num++));
        }while (num1 <= 15);
        System.out.println("The total is "+total);


    }
}
