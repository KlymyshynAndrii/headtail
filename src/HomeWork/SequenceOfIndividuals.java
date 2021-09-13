package HomeWork;

public class SequenceOfIndividuals {
    public static void main(String[] args) {
// sOI --> means Sequence Of Individuals (every individual digit from number we have)
        int sOI=56897;
        int sOI1= sOI%10;
        sOI=sOI/10;
        int sOI2= sOI%10;
        sOI=sOI/10;
        int sOI3 = sOI%10;
        sOI=sOI/10;
        int sOI4= sOI%10;
        sOI=sOI/10;
        int sOI5= sOI%10;

        System.out.println("Digit 1 is "+sOI5+" digit 2 is "+sOI4+" digit 3 is "+sOI3+" digit 4 is "+sOI2+" digit 5 is "+sOI1);
    }
}
