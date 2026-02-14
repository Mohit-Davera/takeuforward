package designpatterns_v2.creational.builder;

public class Director
{
    public Car createSuv(CarBuilder builder){
        builder.setSeats(6).setGPS(true).setEngine("V7").setTripCompute(true);
        return builder.get();
    }

    public ManualCar createManualSportsCar(ManualCarBuilder builder){
        builder.setSeats(2).setGPS(true).setEngine("V8").setTripCompute(true);
        return builder.get();
    }
}
