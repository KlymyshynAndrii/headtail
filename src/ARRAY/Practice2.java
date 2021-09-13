package ARRAY;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {


        int[] zipCodes = {123, 321, 456};
        System.out.println(zipCodes.length);
        System.out.println(zipCodes[2]);
       // System.out.println(zipCodes[5]);
        System.out.println(Arrays.toString(zipCodes));
        zipCodes[1]=999;
        System.out.println(Arrays.toString(zipCodes));

        Object[] objects= {"red", "blue", 55, 'A', 6.57, null, false};
        for (int x=0; x<objects.length; x++){
            System.out.println(objects[x]);
        }
        boolean[] condition= {true,true,false,false,true,5==5, 5!=5};
        System.out.println(Arrays.toString(condition));

        char characters[] = {'a', '4', 12, '!', '$'};
        System.out.println(Arrays.toString(characters));

        int[] chars = {'A'};
        System.out.println(Arrays.toString(chars));

    }
}
