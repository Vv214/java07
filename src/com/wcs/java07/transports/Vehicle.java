package java07.src.com.wcs.java07.transports;

abstract class Vehicle {
    private String brand;
    private int kilometers;

    Vehicle(String brand, int kilometers) {
        this.kilometers = kilometers;
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    
    @Override
    public abstract String doStuff();
}
