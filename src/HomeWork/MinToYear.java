package HomeWork;

public class MinToYear {
    public static void main(String[] args) {
        int min, day=24, year=365, dayInMin, yearInMin, totalMin, hour=60;
        totalMin=3456789;
        min=1;
        dayInMin=min*hour*day; // day in minute
        yearInMin= dayInMin*year; // year in a minute
        year=totalMin/yearInMin;

        day=(totalMin-yearInMin*year)/dayInMin;
        System.out.println("In "+totalMin+" minutes is approximately "+year+" and "+day+" day");
    }
}
