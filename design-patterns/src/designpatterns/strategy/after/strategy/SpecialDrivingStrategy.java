package designpatterns.strategy.after.strategy;

public class SpecialDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
