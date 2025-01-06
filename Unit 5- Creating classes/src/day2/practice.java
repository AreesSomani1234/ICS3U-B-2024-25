package day2;

public class practice {
    private String make;
    private String model;
    private int year;

    public practice(String make, String model, int year){
        this.year = year;
        this.model = model;
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
