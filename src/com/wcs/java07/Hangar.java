package java07.src.com.wcs.java07;

import java07.src.com.wcs.java07.transports.Boat;
import java07.src.com.wcs.java07.transports.Car;

public class Hangar {
    public static void main(String[] args) {
        Car car1 = new Car("Clio", 1250);
        Car car2 = new Car("Punto", 12500);
        Boat boat1 = new Boat("Titanic", 12500);
        Boat boat2 = new Boat("La mer bleue ", 170000);

        System.out.println(car1.doStuff());
        System.out.println(car2.doStuff());
        System.out.println(boat1.doStuff());
        System.out.println(boat2.doStuff());
    }
}
