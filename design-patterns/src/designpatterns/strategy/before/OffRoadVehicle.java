package designpatterns.strategy.before;

public class OffRoadVehicle extends BaseVehicle{
    @Override
    public void drive() {
        System.out.println("Special Drive Capability ");
        //same implementation with sports vehicle
    }
}
