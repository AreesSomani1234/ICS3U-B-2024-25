package day2;

public class Main {
    public static void main(String[] args) {
        CAr car = new CAr("Sedan", "Toyota Camry");

        System.out.println("Calling start():");
        car.start();

        System.out.println("Calling describe():");
        car.describe();
    }
}