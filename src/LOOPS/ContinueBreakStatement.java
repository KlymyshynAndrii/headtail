package LOOPS;

public class ContinueBreakStatement {
    public static void main(String[] args) {
        OUTER:
        for (int number=0; number<15;number++){

  //          if (number == 4){
   //             break;
   //         }
            if (number>=1 && number<=3){
                continue ;
            }
            for (char ch='A'; ch<'H'; ch++){
                if (number == 10){  // word OUTER is only for labeling purpose
                    break OUTER;    // brake
                }
                if (ch=='C' || ch=='D'){
                    continue ;
                }

                System.out.print(number);
                System.out.println(ch);
            }
            System.out.println();
        }
    }
}
