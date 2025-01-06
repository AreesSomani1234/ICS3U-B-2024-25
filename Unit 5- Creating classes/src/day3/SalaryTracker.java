package day3;

public class SalaryTracker {
    //Attributes
    private String name;
    private String position;
    private int totalSalary;

    //constructor
    public SalaryTracker(String name, String position){
        this.name = name;
        this.position = position;
        this.totalSalary = 0;
    }

    //methods
    public void addEarnings(int earnings){
        totalSalary += earnings;
    }
    public int totalSalaryEarned(){
        return totalSalary;
    }
    public String display(){
        return "Name: " + name + " Position: " + position + " total Salary:" + totalSalary;
    }

}
