package LOOPS;

public class MultiplicationTable {
    public static void main(String[] args) {
        // use for loop to create a mult table for num 6
        // from 1 to 10
        int a=6;
        for (int b=1;b<=10 ;b++ ){
            System.out.println(a+"*"+b+"="+a*b);
        }
        System.out.println();
        // use for loop to create a mult table for num from 1 to
        // from 1 to 10
     for  (int i=1; i<=10; i++){
         for (int c=1; c<=10; c++){
             System.out.println(i+"*"+c+"="+i*c);
         }
         System.out.println();
     }
     // perfect number: a number is equals to its divider sum(except number itself)

     int num= 11;
     int res=0;
     for (int num1=1;num1<num;num1++) {
         if (num%num1==0) {
             res = res+ num1;

         }
     }System.out.println( " the sum "+res);
     if (num == res){
         System.out.println("the num "+res+" is a perfect number");
     }
     else {
         System.out.println( "You number is not perfect");
     }

    }
}
