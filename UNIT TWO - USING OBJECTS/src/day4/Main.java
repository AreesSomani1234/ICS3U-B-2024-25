// package day4;

// import day2.Student;

// public class Main {
//     public static void main(String[] args) {
        
//         Teacher mrSmith = new Teacher("Mr. Smith", "Math", 10);

//         Student john = new Student("John", 85, 95.0);
//         Student jane = new Student("Jane", 90, 98.0);

//         Course mathCourse = new Course("Algebra", mrSmith);

//         mathCourse.addStudent(john);
//         mathCourse.addStudent(jane);

//         mathCourse.startClass();

//         mrSmith.assignGrade(john, 85);
//         mrSmith.assignGrade(jane, 90);

//         john.attendClass();
//         jane.attendClass();

//         mathCourse.printCourseRoster();

//         john.graduate();
//         jane.graduate();

//         System.out.println("Will John  graduate" + john.graduate());
//         System.out.println("Will Jane graduate" + jane.graduate());


//     }
// }