package IF_statement;

public class Practice2 {
    public static void main(String[] args) {
        int age = 12;
        double money= 200;
        if(age>=18){
            System.out.println("you can go to picnic");
        }
        if (money>= 100){
            System.out.println("You can go to picnic with this money"+money);
        }
        if (age>=18 || money>=100){
            System.out.println("You are okay with one of the requirement");
        }

    }
}
