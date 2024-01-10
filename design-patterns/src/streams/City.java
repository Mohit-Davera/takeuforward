package streams;

public class City {
    private String name;
    private double temperature;

    public City(String name, double temperature)
    {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName()
    {
        return name;
    }

    public Double getTemperature()
    {
        return temperature;
    }

    @Override
    public String toString()
    {
        return name + " --> " + temperature;
    }
}
