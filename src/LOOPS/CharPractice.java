package LOOPS;

public class CharPractice {
    public static void main(String[] args) {
        // print out the alphabet in upper case

        String str;
        for (char ch='A', ch1='a';ch<='Z' && ch1<='z';ch++, ch1++){
            System.out.print(""+ch+ch1+"-");
        }
    }
}
