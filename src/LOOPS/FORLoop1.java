package LOOPS;

public class FORLoop1 {
    public static void main(String[] args) {
        //int number=1;

        for ( int number=1;number<5  ;number++  ){
    //code
            System.out.println("It is for LOOP"+number);

        }
        int number=1;
        for (       ;number<5  ;number++  ){
            //code
            System.out.println("It is second for LOOP"+number);

        }
        for (     ;number<10;    ){    // condition must be on middle in the perentethes
            //code
            number++;
            System.out.println("It is third for LOOP"+number);

        }
    }
}
