package day2;

public class CarClass {
    private String make;
    private String model;
    private int year;
    private double milage;

    public CarClass(String Carmake, String Carmodel, int Caryear, double Carmilage){
        make = Carmake;
        model = Carmodel;
        year = Caryear;
        milage = Carmilage;
    }
    public String getCarmake(){
        return make;
    }
    public void setCarmake(String Carmake){
        make = Carmake;
    }
    public String getCarModel(){
        return model;
    }
    public void setCarModel(String Carmodel){
        model = Carmodel;
    }
    public int getCarYear(){
        return year;
    }
    public void setCarYear(int Caryear){
        year = Caryear;
    }
    public double getCarmilage(){
        return milage;
    }
    public void setCarMilage(double Carmilage){
        milage = Carmilage;
    }

    public void displaycardetails(){
        System.out.println("Make: " + make + "Model" + model + "Year:" + year + "Milage:" + milage);
    }
    public void drive(double milesDriven){
        milage += milesDriven;
        System.out.println(milage);
    }
    
    
}
