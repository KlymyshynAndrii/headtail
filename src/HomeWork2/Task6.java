package HomeWork2;

public class Task6 {
    public static void main(String[] args) {
        int salary= 200000;
        double bon50PercOfSal=salary*0.5*0.05;
        double bon30PercOfSal=salary*0.3*0.08;
        double bon20PercOfSal=salary*0.2*0.10;
        double totalSalary= salary+bon50PercOfSal+bon30PercOfSal+bon20PercOfSal;
        System.out.println("Salary and all bonuses which is the Bob make per year is "+totalSalary);
    }
}
