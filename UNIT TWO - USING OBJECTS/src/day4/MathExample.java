package day4;

public class MathExample {
    public static void main(String[] args) {
        //ass long as they have different arguments they can have the same name

        int x = -6;
        System.out.println(Math.abs(x));
        double y = -8.9;
        System.out.println(Math.abs(y));

        //get the length of the line segment connecting the two points (1,5)
        //and (2,12)

        int x1 = 1, x2 = 2;
        int y1 = 5, y2 = 12;

        double length = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));


    }

}
