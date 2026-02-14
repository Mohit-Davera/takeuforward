package designpatterns_v2.creational.builder;

public class CarBuilder implements Builder{

    public CarBuilder() {
        this.car = new Car();
    }

    private Car car;
    @Override
    public Builder setSeats(int seats) {
        this.car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripCompute(boolean isTripComputeFeatureEnabled) {
        this.car.setTripComputerEnabled(isTripComputeFeatureEnabled);
        return this;
    }

    @Override
    public Builder setGPS(boolean isGPSEnabled) {
        this.car.setGPSEnabled(isGPSEnabled);
        return this;
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    public Car get(){
        Car newCar = this.car;
        this.reset();
        return newCar;
    }
}
