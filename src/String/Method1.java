package String;

public class Method1 {
    public static void main(String[] args) {
        String city= "Chicago";
        city.concat("is very cold");
        System.out.println(city); // chicago
// String is immutable - original value will change unless you reassign it
        // or create new string
        String newCity=city.concat("  is very beautiful");
        System.out.println(city); // Chicago
        System.out.println(newCity);

        int letterCount= newCity.length();
        System.out.println(letterCount);
        city.charAt(0);
        city.charAt(3);
       // city.chars(9); // error since there is no index of 9

        System.out.println("It is almost time to go home");
    }
}
