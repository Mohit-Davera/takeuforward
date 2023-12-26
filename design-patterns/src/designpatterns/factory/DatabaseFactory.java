package factory;

public class DatabaseFactory {
    public static Database getInstance(String name){
        Database database;
        if(name.equalsIgnoreCase("MYSQL")){
            database = new MySql();
        } else if (name.equalsIgnoreCase("POSTGRESQL")) {
            database = new PostGreSQL();
        }else if (name.equalsIgnoreCase("ORACLE")) {
            database = new Oracle();
        }
        else{
            throw new RuntimeException("Cannot generate instance for given name " + name);
        }
        return database;
    }

}
