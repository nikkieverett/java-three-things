public class Main {

    public static void main(String[] args) {
        Pets bentley = new Pets ("black and white", "Bentley", "Boston Terrier", "male");
        Pets summer = new Pets("gold", "Summer", "Collie", "female");
        Pets cooper = new Pets("brown", "Cooper", "Pug", "male");

        Home home = new Home(4, "house", "500 Magnolia Ln");

        Car yaris = new Car("Toyota", "Yaris", 4, 2007);

        bentley.printInfo();
        summer.printInfo();
        cooper.printInfo();
        home.printInfo();
        yaris.printInfo();

    }


}
