package ee.omis;

public class Car {
    int wheels;
    int doors;
    String type;

    // Constructor ("funktsioon", mille kaudu anname klassi omadustele väärtuseid)
    public Car(int rattad, int uksed, String tyyp) {
        this.wheels = rattad;
        this.doors = uksed;
        this.type = tyyp;
    }

    // "constuctor" overloading
    public Car() {
        this.wheels = 3;
        this.doors = 4;
        this.type = "Sedaan";
    }

    public int getDoors() {
        System.out.println("Doors given");
        return doorsCalculation();
    }

    private int doorsCalculation() {
        this.wheels = 4;
        System.out.println("Doors calculated");
        return doors*4;
    }

    // Method overloading
    public void openDoor() {
        System.out.println("Door opened");
    }

    public void openDoor(String tyyp) {
        System.out.println("Door opened");
    }

    public void openDoor(String tyyp, int arv) {
        System.out.println("Door opened");
    }

    public void openDoor(int arv) {
        System.out.println("Door opened");
    }

    @Override
    public String toString() {
        return "Car objekt koos oma omadustega: " +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", type='" + type + "'";
    }
}
