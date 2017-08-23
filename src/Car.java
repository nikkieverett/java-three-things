public class Car {
    private String make;
    private String model;
    private Integer numberOfDoors;
    private Integer year;

    public Car(String make, String model, Integer numberOfDoors, Integer year){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.year = year;
    }

    public void printInfo(){
        System.out.println("I have a " + this.year + " " + this.numberOfDoors + " door " + this.make + " " + this.model);
    }
}
