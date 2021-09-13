package LOOPS;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random number= new Random();
        int a = number.nextInt(2);  // limit maximum, start from 0 up to bound
        System.out.println(a);

    }
}
