package IF_statement;

public class CurlyBracketPractice {
    public static void main(String[] args) {
        int appleNumber = 20;
        int orangeNumber=30;
    if (appleNumber>orangeNumber) {
        appleNumber++;
        System.out.println("There are more apple in a store " + appleNumber);
    }
    if (orangeNumber>appleNumber) {
        orangeNumber++;
        ++orangeNumber;
        System.out.println("There are more orange in a store " + orangeNumber);
    }
    }
}
