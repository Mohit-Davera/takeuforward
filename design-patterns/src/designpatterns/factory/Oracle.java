package factory;

public class Oracle implements Database {
    @Override
    public String getName() {
        return "ORACLE";
    }
}
