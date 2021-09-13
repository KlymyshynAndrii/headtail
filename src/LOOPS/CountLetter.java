package LOOPS;

public class CountLetter {
    public static void main(String[] args) {
        // "I want to solve this question by my self this time"
        // count how many 'i' and 'I' are at this sentence
        // "There are    is in this code"
        String text="I want to solve this question by my self this time";
        int index = 0;
        int count=0;
        while(index<text.length()){

            if(text.charAt(index)=='i' ||text.charAt(index)=='I'){
                count++;
            }
            index++;

        }
        System.out.println("there are "+count+" 'i' in the sentence");
    }
}
