package designpatterns.builder;

public class Vehicle {
    private final String engine;
    private final int wheels;
    private final int airBags;

    private final Boolean isAbsSupported;

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getAirBags() {
        return airBags;
    }

    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.engine = vehicleBuilder.engine;
        this.wheels = vehicleBuilder.wheels;
        this.airBags = vehicleBuilder.airBags;
        this.isAbsSupported = vehicleBuilder.isAbsSupported;
    }

    public static class VehicleBuilder {
        private final String engine;
        private final int wheels;

        private int airBags;
        private Boolean isAbsSupported;

        public VehicleBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public VehicleBuilder setAirBags(int airBags) {
            this.airBags = airBags;
            return this;
        }

        public VehicleBuilder setAbsSupported(Boolean absSupported) {
            this.isAbsSupported = absSupported;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
