package day3;

public class Example2 {
    public static void main(String[] args) {
        // double x = 7;   // widening conversion int -> double
        //                 // implicit cast
        // double a = (double) 4/3;    //explicit becauseo\6yx your adding double
        // System.out.println(a);
        // a = (double) (4/3);
        // System.out.println(a);


        // int z = 8.9; //java cant do a implicit narrowing conversion
        // int z = (int)8.9; // we can perform an explicit narrowing conversion

        // double n = (double)false;    // cannot cast from boolean to double

        // widening convesion - Java increased the percision, implicit cast
        double d = 7.4
        int b = 7;
        double e = b*d;
        System.out.println(e);



    }                               
}
