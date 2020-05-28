package ee.omis;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();

//        bmw.getDoors();
//        bmw.openDoor();
//
//        System.out.println(bmw);

        Motorcycle harley = new Motorcycle(2, "chopper");
        harley.setWheels(4);
        System.out.println(harley);
    }
}
