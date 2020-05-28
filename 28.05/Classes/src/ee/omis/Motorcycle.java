package ee.omis;

public class Motorcycle {
    private int wheels;
    private int doors = 0;
    private String type;

    public Motorcycle(int wheels, String type) {
        this.wheels = wheels;
        this.type = type;
    }

    // int (võib ka olla String, boolean) tagastab seda tüüpi muutuja
    // kui on tüüp määratud, peab olema alati ka RETURN funktsiooni lõpus
    public int getWheels() {
        return wheels;
    }

    // void -> ei tagasta midagi
    // ei tohi olla returni lõpus
    public void setWheels(int rattad) {
        this.wheels = rattad;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", type='" + type + '\'' +
                '}';
    }
}
