package String;

public class MethodChaining {
    public static void main(String[] args) {
        String text= "  just do it";
        int x =text.replace('a','*').trim().replace("e","**").toUpperCase().indexOf('*');
        System.out.println(x);
        char ch =text.replace('a','*').trim().replace("e","**").toUpperCase().charAt(0);
        String a=text.replace('a','*').trim().replace("e","**").toUpperCase();
        System.out.println(ch);
        System.out.println(a);


    }

}
