package day2;

public class Driver {
    public static void main(String[] args) {
        Student student1;
        Student student2 =  new Student("Steve", 21, "1126804", 3.8, "Computer Science", 2027, true);
        Student student3 = new Student("Nadia", 21, "4445678", 2.9, "Accounting", 2026, true);
        student1 = student3;

       //  System.out.println(student1.name); only have access outside of the class to public stuff

        student2.study(5); // to activate (use) methods we use dot operator
        student1.attendClass("Math");
        student3.attendClass("Gym");

        boolean isSmart = student1.isHonors();
        System.out.println("Is the student smart? " + isSmart);
        System.out.println("Is the student smart? " + student2.isHonors());
    }


}
