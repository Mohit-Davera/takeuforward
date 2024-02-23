package designpatterns.strategy.before;

public class SportsVehicle extends BaseVehicle{
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
        //same implementation with off road vehicle
    }
}
