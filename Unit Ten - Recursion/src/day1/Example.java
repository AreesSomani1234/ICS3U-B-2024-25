package day1;

public class Example {
    static long[] solutions;
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(7));
        // System.out.println(fibonacci(100));
        int n = 100;
        solutions = new long[n+1];
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if(n==1|| n == 2){
            return 1;
        }
        if(solutions[n] != 0){
            return solutions[n];
        }
        solutions[n] = fibonacci(n-1) + fibonacci(n-2);
        return solutions[n];
    }

    private static int recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
}
