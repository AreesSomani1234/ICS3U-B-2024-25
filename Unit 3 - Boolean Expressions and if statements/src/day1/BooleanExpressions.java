package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true;

        System.out.println(hasRedShoes == true); //prints true T==T
        System.out.println(hasRedShoes = false); // prints false T==F

        // = is assignment operator
        //==is equality operator

        int numStudents = 9;

        boolean largeClass = numStudents > 24; // numSTudents > 24 is false
        System.out.println("Large Class? " + largeClass);


        /*
         * == equals
         * > greater thann
         * >= gretaer than or equal 
         * < than
         * <= less than or equal
         * != dosen't equal
         * ! not
         */

        int x = 27;

        boolean a = x > 10; // a will be true
        boolean b = x <= 10;    // b will be false
        boolean c = a==!b;  // boolean expression is a == !b
                            //c will be T => T == !F => T ==T

        boolean d = !(x<= 10); //true

    }
}
