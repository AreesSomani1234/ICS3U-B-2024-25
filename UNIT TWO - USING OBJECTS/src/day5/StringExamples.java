package day5;

public class StringExamples {
    public static void main(String[] args) {
        System.out.println("This is a String");
        int x = 7;
        int y = 8;

        System.out.println("The Answer is " + x + y);
        System.out.println("The answer is " +(x+y));


        //Places "apple" in same table
        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";


        //dosesnt place "happy" in shared table so it creates 3 "Happy" strings
        String str1 = new String("Happy");
        String str2 = new String("Happy");
        String str3 = new String(str1);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);


        String message = ("AP  COMP  SCI  ROCKS");
//         System.out.println(message.length());
//         int largestIndex = message.length() - 1;

        // int rocks = message.indexOf("ROCKS");
        // int sci = message.indexOf("SCI");
        // System.out.println(sci);
        // System.out.println(rocks);

//         System.out.println(message.substring(1, 4)); // "p  "


//         String s6 = message.substring(10);


//         //last3
//         String LastThree = message.substring(message.length()-3);
//         System.out.println(LastThree);

        


    }

}
