package Primitives;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentNumber=25;
        studentNumber=studentNumber+1;
        studentNumber+=1;
        studentNumber++;
        System.out.println(studentNumber);
        ++studentNumber;
        System.out.println(studentNumber);
        studentNumber--;
        System.out.println(studentNumber);
        --studentNumber;
        System.out.println(studentNumber);
        studentNumber--; studentNumber--; studentNumber--;
        System.out.println(studentNumber);
//=================================================
        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++); // it shows the value fist and then increase
        System.out.println(studentNumber); // --> 25
        System.out.println(++studentNumber);

        System.out.println(studentNumber--);// shows 26, decrease by 1
        studentNumber--;
        --studentNumber;
        System.out.println(--studentNumber); //decrease first 23, shows 22
        System.out.println(studentNumber);

        int a = studentNumber++ + studentNumber++ +5+100;
        a--;
        a=studentNumber;
        System.out.println(a--); //shows 24, a=23
        System.out.println(a--); // shows 23, a=22
        System.out.println(a);












    }
}
