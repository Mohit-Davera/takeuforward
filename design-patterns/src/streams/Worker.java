package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Worker {
    public static void main(String[] args) {
        List<City> cities = prepareTemperature();
        List<City> cities1 = new CopyOnWriteArrayList<>(prepareTemperature());
        for(City i : cities1){
            if(i.getName().equals("New Delhi"))
                cities1.remove(i);
        }
        System.out.println(cities1);
    }

    private static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 44));
        return cities;


    }

}
