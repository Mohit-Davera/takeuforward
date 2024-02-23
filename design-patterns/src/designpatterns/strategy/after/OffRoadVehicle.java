package designpatterns.strategy.after;

import designpatterns.strategy.after.strategy.SpecialDrivingStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SpecialDrivingStrategy());
    }
}
