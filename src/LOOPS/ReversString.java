package LOOPS;

public class ReversString {
    public static void main(String[] args) {
         // Selenium revers vers
        String text= "oto";
        String revers="";
        for (int index=text.length()-1;index>=0 ; index--){
            revers=revers+text.charAt(index);
        }
        System.out.println("Final version "+revers);
    if (text.equalsIgnoreCase(revers)){
        System.out.println("The word is PALINDROM "+text);
    }
    else{
        System.out.println("The word is not PALINDROME "+text);
    }

    }
}
