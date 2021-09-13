package Project3;

public class Task3 {
    public static void main(String[] args) {
      /*
      Please use method chaining for the foll
owing Strings. Methods are provided next to theString.
String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C’
       */
        String text=" Snicker ";
        String text1 = "Cookie";
        System.out.println(text.trim().toUpperCase().substring(1,5).charAt(3));
        System.out.println(text1.toLowerCase().replace('o','u').concat("s").startsWith("C"));
    }

}
