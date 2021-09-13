package LOOPS;

public class ForLoopHourMin {
    public static void main(String[] args) {
        /*
        create digital clock that prints hours and minutes
        >>hour from 0 to 11 included
        >>minutes from 0 to 59 included
         */
        for (int a = 00; a < 02; a++) {
            if (a==0){
                continue;
            }
            for (int h = 00; h < 12; h++) {
                if (h >= 5 && h <= 7) {
                    continue;
                }
                if (h>=10){
                    break;
                }
                //System.out.println(h);
                for (int m = 00; m < 60; m++) {
                    if (a == 00) {
                        System.out.println(h + ":" + m + "am");
                    } else {
                        System.out.println(h + ":" + m + "pm");
                    }
                }
            }
        }
    }
}
