package String;

public class Method2 {
    public static void main(String[] args) {
        String name = "Diana";
        System.out.println(name.indexOf("D"));
        System.out.println(name.indexOf('D'));
        System.out.println(name.indexOf("Di")); //
        System.out.println(name.indexOf("ana"));
        System.out.println(name.indexOf("tina"));
        System.out.println(name.indexOf("k"));
        name = name.concat(" Bejan");

        System.out.println(name);
       // name.

        System.out.println(name.indexOf("a",5)); // --> it will start looking for that char
                                                                // starting from giving index
        name .indexOf("B",name.indexOf(" "));
        System.out.println(name.indexOf("B",name.indexOf(" "))); //Arzu Beril Sen
        name = "Arzu Beril Sen";
        System.out.println(name.indexOf("e",name.indexOf(" ")+2));
        System.out.println(name .indexOf("B", name.indexOf(" ")+2));
        //System.out.println(name);
        //name.indexOf(); // value that we gave inside of the method parentheses  are called parameter
                        // some method take no parameter, some take single parameter
        //name.length(); // -->no parameters
        //name.charAt(3); // single parameter
        //name.indexOf("e",4); // you can pass either 1 or 2 parameters by separating them by coma


    }
}
