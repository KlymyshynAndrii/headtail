package LOOPS;

public class ForLOOP4 {
    public static void main(String[] args) {
        // sting str = "adof123455';'/"
        // count and print out how many letters
        // count and print out how many number
        // count and print out how many character
        String str="Abc587*/?!@";
int countNum=0;
int countLetter=0;
int countChar=0;
str=str.toLowerCase();
        for (int i=0; i<str.length() ;  i++ ){

          if (str.charAt(i) >='a' && str.charAt(i)<='z'){
              countLetter++;
          }else if (str.charAt(i)>='0' && str.charAt(i)<='9'){
              countNum++;
            }else {
              countChar++;
            }

        }
        System.out.println("Letter "+countLetter);
        System.out.println("Number "+countNum);
        System.out.println("Character "+countChar);
    }
}
