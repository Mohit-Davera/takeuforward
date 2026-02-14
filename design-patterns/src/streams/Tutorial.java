package streams;

import com.sun.nio.sctp.AbstractNotificationHandler;
import striver.heap.heap_aditya.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tutorial {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
        intStream.filter(n -> {
                    System.out.println("filter " + n);
                    return n > 2;
                })
                .map(n -> {
                    System.out.println("map " + n);
                    return n * 2;
                })
                .limit(1)
                .forEach(System.out::println);


        Stream<Pair<Integer, String>> pairStream = Stream.of(new Pair<>(1, "M"), new Pair<>(2, "B"), new Pair<>(3, "C"));

        Map<Integer, String> collect = pairStream.collect(Collectors.toMap(Pair::getKey, Pair::getValue, (p1, p2) -> p1));

        List<Product> products = List.of(
                new Product("Laptop", 1200.0),
                new Product("Laptop", 1500.0), // Duplicate key
                new Product("Mouse", 25.0)
        );

        Map<String, Double> productPriceMap = products.stream()
                .collect(Collectors.toMap(
                        Product::getName, // Key Mapper
                        Product::getPrice, // Value Mapper
                        Double::sum // Merge Function: keep the first one
                ));

        System.out.println("Product Price Map: " + productPriceMap);
        products.stream().collect(Collectors.toMap(Product::getName,Product::getPrice,Double::sum));


    }
}
