package designpatterns.strategy.after;

import designpatterns.strategy.after.strategy.SpecialDrivingStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDrivingStrategy());
    }
}
