package Primitives;

public class BooleanPractice {
    public static void main(String[] args) {

        boolean isLightOn=true;
        boolean isBreakTime;

        isBreakTime=isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        boolean isClear= false;
        System.out.println(isClear);
        // System.out.println(isBreakTime+isClear); will not compile
        System.out.println("!!!!!"+isClear+isBreakTime);
        // for a boolean you can use only value "true/false" (just refferances)

        boolean bl= true; // work/yes/on/open
        boolean bl2= false; //not working/off/no/closed

        int i1=5;
        int i2=5;
        int i3=10;
        // is i1 equal to i2? yes --> true    i1==i2  --> true
        // is i1 equal to i3? no --> false    i1==i3 --> false

        boolean isi1EqualsToi2 = i1==i2;
        System.out.println(isi1EqualsToi2);
        boolean isi1EqualsToi3 = i1==i3;
        System.out.println(isi1EqualsToi3);

    }
}
