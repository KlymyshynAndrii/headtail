package Variables;

public class Practice4 {
    public static void main(String[] args){
        /*
        in a farm
        there are 12 cows and 23 chickens
        each chickens cost is 10$
        each cows cost 500$
        1- calculate the total of legs of the animals in this farm
        2- calculate the total cost of animals in the farm
        */
        int cow=12;
        int cowCost=500;
        int chicken=23;
        int chickenCost=10;
        int chickenLegs=2;
        int cowLegs=4;

        int totalCowLegs=cow*cowLegs;
        int totalChickenLegs=chicken*chickenLegs;

        int totalLegs=totalChickenLegs+totalCowLegs;

        int totalCost=chickenCost*chicken+cow*cowCost ;

        System.out.println(totalLegs+" total legs") ;
        System.out.println(totalCost+" total cos");

    }
}
