package designpatterns.factory;

import java.util.*;
import java.util.stream.IntStream;

public class FactoryMain {
    public static void main(String[] args) {
        Database mysql = DatabaseFactory.getInstance("MYSQL");
        mysql.getName();
    }
}