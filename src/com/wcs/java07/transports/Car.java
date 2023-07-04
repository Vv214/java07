package java07.src.com.wcs.java07.transports;

public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        String message;
        message = "Je suis " + getBrand() + " et je fais vroum vroum ! ";
        return message;
    }
}
