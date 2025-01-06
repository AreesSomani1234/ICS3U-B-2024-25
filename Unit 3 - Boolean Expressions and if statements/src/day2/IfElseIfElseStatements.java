package day2;

public class IfElseIfElseStatements {
    public static void main(String[] args) {
        // int mark = (int)(Math.random()*61)+20;
        int mark = 65;

        if (mark >= 90){
            System.out.println("A+");
        }else if (mark >= 80){
            System.out.println("A");
        }else if (mark >= 70){
            System.out.println("B");
        }else if (mark >= 60){
            System.out.println("C");
        }else if (mark >= 50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        
    }

}
