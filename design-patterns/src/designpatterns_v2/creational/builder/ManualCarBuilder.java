package designpatterns_v2.creational.builder;

public class ManualCarBuilder implements Builder {

    private ManualCar manualCar;
    public ManualCarBuilder() {
        this.manualCar = new ManualCar();
    }


    @Override
    public Builder setSeats(int seats) {
        manualCar.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        manualCar.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripCompute(boolean isTripComputeFeatureEnabled) {
        manualCar.setTripComputerEnabled(isTripComputeFeatureEnabled);
        return this;
    }

    @Override
    public Builder setGPS(boolean isGPSEnabled) {
        manualCar.setGPSEnabled(isGPSEnabled);
        return this;
    }

    public ManualCar get() {
        ManualCar newCar = manualCar;
        this.reset();
        return newCar;
    }

    @Override
    public Builder reset() {
        this.manualCar = new ManualCar();
        return this;
    }
}