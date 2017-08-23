public class Home {
    private Integer numberOfBedrooms;
    private String type;
    private String address;

    public Home(Integer numberOfBedrooms, String type, String address){
        this.numberOfBedrooms = numberOfBedrooms;
        this.type = type;
        this.address = address;
    }

    public void printInfo(){
        System.out.println("I have a " + this.type + " with " + this.numberOfBedrooms + " bedrooms, located at " + this.address);
    }
}
