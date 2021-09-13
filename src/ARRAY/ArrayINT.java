package ARRAY;

import java.util.Arrays;

public class ArrayINT {
    public static void main(String[] args) {
        int [] numbers = new int [5];
        System.out.println(numbers);
        numbers [0]=11;
        System.out.println(numbers[0]);  //11
        System.out.println(numbers[1]);  //0
        numbers[1]=22;
        numbers[4]=44;
        System.out.println(numbers[4]);
        //numbers[5]=55;// it will give ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");//Array from FOR LOOP
        }

    }
}
