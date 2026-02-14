package designpatterns_v2.creational.builder;

public interface Builder {
    Builder setSeats(int seats);
    Builder setEngine(String engine);
    Builder setTripCompute(boolean isTripComputeFeatureEnabled);
    Builder setGPS(boolean isGPSEnabled);
    Builder reset();
}
