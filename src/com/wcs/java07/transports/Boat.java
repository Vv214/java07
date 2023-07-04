package java07.src.com.wcs.java07.transports;

public class Boat extends Vehicle {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        String message;
        message = "Je suis " + getBrand() + " et je fais glou glou ! ";
        return message;
    }
}
