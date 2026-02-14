package designpatterns_v2.creational.builder;

public class Car {
    private int seats;
    private String engine;
    private boolean isTripComputerEnabled;
    private boolean isGPSEnabled;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripComputerEnabled() {
        return isTripComputerEnabled;
    }

    public void setTripComputerEnabled(boolean tripComputerEnabled) {
        isTripComputerEnabled = tripComputerEnabled;
    }

    public boolean isGPSEnabled() {
        return isGPSEnabled;
    }

    public void setGPSEnabled(boolean GPSEnabled) {
        isGPSEnabled = GPSEnabled;
    }
}
