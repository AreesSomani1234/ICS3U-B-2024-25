package day4;

public class WrapperExample {
    public static void main(String[] args) {
        Integer int1 = new Integer(7); // assigning an integer object(7) to int1
        Integer int2 = 8; 
    // assigns a primitive int (8 but Java) creates an Integer object for you.
    //This is auto-boxing

    int y = int1;    // auto unboxing

    int z = int2.intValue();  //does the same as the line above with more works
    
    System.out.println(Integer.MAX_VALUE); //include 0 as positive #
    System.out.println(Integer.MIN_VALUE);
    }

}
