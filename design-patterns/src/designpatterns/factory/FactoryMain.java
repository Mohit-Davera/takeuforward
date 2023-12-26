package factory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FactoryMain {
    public static void main(String[] args) {
        String m = "mohit";
        char[] chars = m.toCharArray();
        List<Character> collect = IntStream.range(0, chars.length).mapToObj(m::charAt).toList();
        System.out.println(collect);
    }
}