package ARRAY;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // create array for 45,5, 6 47, 57, 8, 12, 0, 30
        // store num they are less than 10 in another array
        int [] num= {45,5, 6, 47, 57, 8, 12, 0, 30};
        int smallNum[]= new int[num.length];
        for (int i=0; i<num.length; i++){
            if (num[i]>10) {
                System.out.print(num[i]);
                if(i!=num.length-1) {
                    System.out.print(",");
                }
            }else {
                smallNum[i]=num[i];
            }

        }
        System.out.println(Arrays.toString(smallNum));
    }
}
