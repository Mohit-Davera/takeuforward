package designpatterns.singleton;

public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private String name;
    private SingletonEager(){

    }

    public static SingletonEager getInstance(String name) {
        INSTANCE.name = name;
        return INSTANCE;
    }

    void print(){
        System.out.println(name);
    }



}
