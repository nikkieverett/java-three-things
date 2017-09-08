public class Pets {
    private String color;
    private String name;
    private String type;
    private String sex;

    public Pets(String color, String name, String type, String sex){
        this.color = color;
        this.name = name;
        this.type = type;
        this.sex = sex;
    }
    public void printInfo(){
        System.out.println("I have a " + this.type + ".");
        if(this.sex == "male" || this.sex == "Male"){
            System.out.println("His name is " + this.name + ".");
            System.out.println("He is " + this.color +  ".");
        } else {
            System.out.println("Her name is " + this.name + ".");
            System.out.println("She is " + this.color +  ".");

        }
    }
}
