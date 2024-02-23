package designpatterns.strategy.after;

import designpatterns.strategy.after.strategy.NormalDrivingStrategy;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {
        super(new NormalDrivingStrategy());
    }
}
