package day1;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
        System.out.println("animal constructor called for " + name);
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public String getNamer(){
        return this.name;
    }
}
