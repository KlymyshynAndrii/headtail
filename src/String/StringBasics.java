package String;

import java.util.Locale;

public class StringBasics {
    public static void main(String[] args) {

        String text= "School";
        String name= new String("David");
        System.out.println(text);
        System.out.println(name);

        text = text+" is Techtorial";
        System.out.println(text);

        text+=" Academy";
        System.out.println(text);
        // text-="Academy"; you can not use -, *, / or % with string
        String word=name+text;
        System.out.println(word+"5");
        System.out.println(word);

        name= name+ text;
        name+=text;
        System.out.println(name);

        String str="JAVA";
        String str1="selenium";
        String result = str+" "+str1;
        System.out.println(result);
        System.out.println(str1+" is next");
        System.out.println(str+" is first");
        System.out.println(result+str+str1);

        str= str+5+6;
        System.out.println(str);

        str1=str1+"5"+"6";
        System.out.println(str1);

        result=5+6+result;
        System.out.println(result);

        str="Java";
        str=str+2+5*6;
        System.out.println(str);
        System.out.println(str+15/3);

        str= "Java";
        int a=12;
        str.concat(" is coll");
        System.out.println(str);
        str=str.concat(" is very easy");
        System.out.println(str);

        str=str.toUpperCase();
        System.out.println(str);



    }
}
