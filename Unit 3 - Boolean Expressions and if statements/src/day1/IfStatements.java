package day1;

public class IfStatements {
    public static void main(String[] args) {

        boolean hasRedShoes = true;

        if (hasRedShoes) {
            System.out.println("I like your red shoes");

        }

        if (!hasRedShoes) {
            System.out.println("you should buy red shoes");
        }

        int numStudents = 9;
        final int BIG_CLASS = 24;

        if (numStudents >= BIG_CLASS) {
            System.out.println("This is a big class");
        }
        
        if (numStudents == 3) {
            System.out.println("this is a small class");
            System.out.println("It is really small");
        }

        // if only 1 line in the if statement you do not need {}
    }

}
