package designpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.VehicleBuilder("V8", 4).setAirBags(2).setAbsSupported(true).build();
        System.out.println(vehicle.getEngine());
    }
}
