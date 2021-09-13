package Primitives;

public class RemainderPractice3 {
    public static void main(String[] args) {
        // by using % operator
        //$875 -- $100 for each month
        //print last month's payment witch is $75

        int price=875;
        int monthly= 100;
        int lastMonth= price % monthly;
        System.out.println("$"+lastMonth+ " is your last month payment");

        boolean bl=true;
        boolean bl1= true;
        // boolean b2 = bl+bl1; this is not possible

    }
}
