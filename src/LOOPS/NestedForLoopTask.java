package LOOPS;

public class NestedForLoopTask {
    public static void main(String[] args) {
        /*
        print the month for years 2020 to 2023
         */
        for (int y=2020; y<=2023; y++){
            System.out.println(""+y);
            for (int m=1;m<=12;m++ ){
                System.out.print("month >>> "+m);
                for (int week=1; week<=4; week++){
                    System.out.println();
                    System.out.println("week  >>>"+week);
                }
            }System.out.println();
        }

    }
}
