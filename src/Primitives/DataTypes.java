package Primitives;

public class DataTypes {
    public static void main(String[] args) {

    /*
     there are 8 different primitive data types
     byte, short, int, long, float, double --> for numbers
     char --> single character
     boolean --> for True/False
    */
        byte number = 6;
        byte number1 = 127;
        //byte number2= 129; for byte the range is -128 to 127. thats why is not compile

        short number3 = 100;
        short number4 = 31769;


        int number5 = 32_000; // you can use underscore ( _ ) in between digits is not effect the value
        int number6 = 1_000_000; // you can use underscore ( _ ) in between digits is not effect the value

        System.out.println(number6);

        long number7 = 341345;
        long number8 = 74_813_492_034_854L; //you should use 'l/L' at the end of the lond value

        System.out.println(number8);

        float number9=2.3f; // you should use "f"-->float
        float number10=56;  // 56 --> 56.0

        System.out.println("Value of number10 -->"+number10);
        float number11=56.0f;

        double number12=2.1;
        double number13=89; // 89--> 89.0
        // most common primitive data type usage are int, double, long, boolean

        System.out.println(number12);




    }
}
