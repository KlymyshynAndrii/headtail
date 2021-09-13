package LOOPS;

public class nestedForLooP {
    public static void main(String[] args) {
int i=1;
        for (int a=0 ; a<3 ; a++){
            for (int b= 0; b<5; b++){
                System.out.println( i++ +")" +" a >> "+a+" b >> "+b);
            }System.out.println("**********");
        }
        for (int a= 1; a<5; a++){
            for ( char c = 'a'; c<'d';c++){
                System.out.println(""+a+c);
            }
        }
    }
}
