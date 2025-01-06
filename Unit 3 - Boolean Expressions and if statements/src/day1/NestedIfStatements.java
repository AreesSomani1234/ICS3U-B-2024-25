package day1;

public class NestedIfStatements {
    public static void main(String[] args) {
        //check if x is even and bigger than 100

        int x = 456378;
        
        if (x % 2 == 0) {
            if (x > 100) {
                System.out.println("x is even and greater than 100");
            }
        }
    }
    
}
