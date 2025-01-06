package day3;

public class Example1 {
    public static void main(String[] args) {
        int mark1 = 70, mark2 = 96, mark3 = 88;
        double average;
        int numMarks = 3;

        average = (mark1 + mark2 + mark3) / (double)numMarks;       
        System.out.println(average);
        
        
        // widening convesion - Java/we increased the percision, implicit cast
        // if we increase the percision -explicit but if java does it implicit
    }   

}
