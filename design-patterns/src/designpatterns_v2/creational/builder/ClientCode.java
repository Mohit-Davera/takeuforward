package designpatterns_v2.creational.builder;

public class ClientCode {
    public static void main(String[] args) {
        CarBuilder suvBuilder = new CarBuilder();
        Director director = new Director();

        Car suv = director.createSuv(suvBuilder);
        System.out.println(suv.getEngine());
    }
}