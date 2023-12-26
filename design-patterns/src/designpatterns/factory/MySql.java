package designpatterns.factory;


public class MySql implements Database {
    @Override
    public String getName() {
        return "MYSQL";
    }

}
