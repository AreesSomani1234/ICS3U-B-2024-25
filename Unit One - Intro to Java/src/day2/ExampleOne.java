package day2;

public class ExampleOne {
    public static void main(String[] args) {
        final int number = 1784;

        // get the sum of the individual digits in the number
        // use / and %
        
        int digit1 = number / 1000; // gives you first number
        int digit2 = number/ 100 % 10; // makes the second digit the last number
        int digit3 = number / 10 % 10; // gets 3 digit to be back number
        int digit4 = number % 10; // anytime you want the last digit mod it by 10
       
        int sum = digit1 + digit2 + digit3 + digit4;

        System.out.println(sum);
    }

}
