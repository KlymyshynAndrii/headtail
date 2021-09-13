package Variables;

public class Practice2 {
    public static void main(String[] args){

        int apples = 10;

        int oranges = 20;

        int kiwis = 30;
        System.out.println(oranges);
        System.out.println(kiwis);
        System.out.println("Total number of fruits =" +apples+oranges+kiwis);//Total fruits is 102030
        System.out.println("Total number of fruits = "+ (apples+oranges+kiwis)); // this will show correct addition
        System.out.println(apples+oranges+ " is total of apples and oranges");

        // in one line, print "The total number of apples and kiwis is <...> and difference between kiwi and oranges is<..>"
        System.out.println("The total number of apples and kiwis is "+(apples+kiwis)+" and the difference between kiwi and orange is "+(kiwis-oranges));


    }
}
