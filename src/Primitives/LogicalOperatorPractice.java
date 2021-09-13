package Primitives;

public class LogicalOperatorPractice {
    public static void main(String[] args) {

        /*
        you need to pass a course
        - if you attend a 95% or more of classes
        or
        - you get more than 70 as passing score out of 100
         */
        int attendReq=95;
        int scoreReq=70;
        int myAttend=10;
        int myScore=65;
        boolean pass = myAttend>=attendReq || myScore > scoreReq;

        System.out.println("Am I passing   "+pass);

    }
}
