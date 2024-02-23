package designpatterns.strategy.after;

import designpatterns.strategy.after.strategy.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;

    public Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}
