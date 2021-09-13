package SWITCH;

public class Practice2 {
    public static void main(String[] args) {
        String name = "";
        switch (name){
            default:
                System.out.println("Student is not here");
                break;

            case "Alex":
                System.out.println("Alex is here");
                break;
            case "David":
                System.out.println("David is here");
            case "Luna":
                System.out.println("Luna");
                break;
        }
    }
}
