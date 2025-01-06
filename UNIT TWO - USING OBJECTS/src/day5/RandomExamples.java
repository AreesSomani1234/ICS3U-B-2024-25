package day5;

public class RandomExamples {
    public static void main(String[] args) {
        

        // Num from 1-10
        // int x = (int) (Math.random() * 10); //changing the 10 to 20 gives 20 diff numbers
        // System.out.println(x);

        // int x = (int) (Math.random() * 21 -10); 
        // System.out.println(x);

        //generate a number from min to max inclusive -> ints only

        int min = 8;
        int max = 123;

        int difference = max-min;

        int x = (int) (Math.random() * (difference +1)+min); 
        System.out.println(x);

    }

}
