package designpatterns.strategy.after;

public class Main {


    //Use When two child are having same code that is not present in parent code
    //For Ex Sport and Off-Road vehicle in before package
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
