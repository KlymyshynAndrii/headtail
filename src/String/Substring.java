package String;

public class Substring {
    public static void main(String[] args) {
        String str= "Techtorial";
        String part1=str.substring(2);
        System.out.println(part1);

        String part2= str.substring(2,4);
        System.out.println(part2);
        System.out.println(str.substring(0));
        // print last tree chars from string "I will do it SOON"

        String text="I will do it SOON";

       // int a= (text.length()-1);
        //System.out.println(text.substring(a-2 ));
        System.out.println(text.substring(text.length()-3));
        // when your string value does not have to take substring it will throw on exception (StringOutOfBound)

        String text1="ON";
        System.out.println(text1);



    }
}
