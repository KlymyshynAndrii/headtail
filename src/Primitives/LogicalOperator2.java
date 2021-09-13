package Primitives;

public class LogicalOperator2 {
    public static void main(String[] args) {
        /*to be able to attend to event you need to be age of 18 or pay 100$
         int myAge;
         boolean myMoney;
         int ageReq;
         boolean moneyReq = true;
         boolean canIGo = myAge >= ageReq || myMoney==moneyReq;
          */
        // there are event for kids, they must be 5 or older than 5, 12 or younger than 12
        // Their high needs to be 46" or more than 46"
        // to be able be to attend

        int minA =5, maxA=12, hreq=46;
        int myA =6, myH=48;

        boolean canIGo= (myA >= minA && myA <=maxA) && myH>= hreq;
        System.out.println(canIGo);
    }
}
