package ARRAY;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        // create array for 45,5, 6 47, 57, 8, 12, 0, 30
        // store num they are less than 10 in another array
        int [] nums= {45,5, 6, 47, 57, 8, 12,-25, 20, 30};


        int biggest = nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]>biggest){
                biggest=nums[i];
            }
            //System.out.println(biggest);
        }
        System.out.println(biggest);
        System.out.println(Arrays.toString(nums));
        //Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));
       // System.out.println(nums[nums.length-1]);// last element and biggest num
      //  System.out.println(nums[0]);            // first element and smallest num

   int smallest= nums[0];
   for (int x=1; x<nums.length; x++){
       if (nums[x]<smallest){
           smallest=nums[x];

       }// System.out.println(smallest);
   } System.out.println(smallest);



    }
}