package LOOPS;

public class FORLoop2$$$ {
    public static void main(String[] args) {
        // Print out the letters from a given string
        //Chicsgo

        // print out letter 'o' from this string
        String word= "Chicago";
        for(int a =0; a< word.length();a++ ) {
            System.out.println(word.charAt(a));
        }

        for (int a=word.length()-1;a>=0 ;a-- ){
            System.out.println(word.charAt(a));
        }
        String string= "Today is the day for loop practice";
        int count = 0;
        for (int a = 0; a<string.length(); a++){

            if (string.charAt(a)=='o'){
                System.out.println(string.charAt(a));
                count++;
            }


        } System.out.println(count);
    // show index number of each letter 'o'
    for (int a=0; a<string.length(); a++){
        if (string.charAt(a)=='o'){
            System.out.println("the index of 'o' is "+a);
            count++;
        }
    }

    }

}
