package designpatterns.strategy.after.strategy;

public class NormalDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
