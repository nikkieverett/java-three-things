public class Dog extends Pets {
    private int numOfLegs;
    private String speak;


    public Dog(String color, String name, String type, String sex) {
        super(color, name, type, sex);
        this.numOfLegs = 4;
        this.speak = "Bark bark";
    }
    @Override
    public void printInfo(){
        System.out.println("Im a dog. " + this.speak);
    }
}