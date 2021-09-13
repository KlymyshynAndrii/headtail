package Primitives;

public class CastingPractice {
    public static void main(String[] args){

        long l1=120;
        // int i1=l1; larger data type cannot store in smaller data type
        int i2 = (int)l1; // explicit casting (Auto narrowing)
        double db1 = l1;  // implicit casting

        short apple=799;
        short samsung=600;
        short total = (short)(samsung+apple);
        System.out.println(total);

        byte total1 = (byte)(apple+samsung);
        System.out.println("total  "+total1);

        double d1=2.3;
        int i=12;
        i+=d1; // when you do compound assignment, you don't need to do explicit casting
        System.out.println("i -->"+i);

    }
}
