package IF_statement;

public class DiscountTask {
    public static void main(String[] args) {
        double payment=80;
        double discount=0.20;
        double discount1=0.05;
        if (payment >= 100){
            System.out.println("You payment is "+(payment-payment*discount));
        }
        else {
            System.out.println("You payment is "+(payment-payment*discount1));
        }
    }
}
