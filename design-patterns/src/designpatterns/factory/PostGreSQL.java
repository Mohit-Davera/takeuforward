package designpatterns.factory;

public class PostGreSQL implements Database {
    @Override
    public String getName() {
        return "POSTGRESQL";
    }
}
