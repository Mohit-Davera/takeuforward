package designpatterns_v2.creational.prototype;

public abstract class Prototype {
    String name;
    public abstract Prototype clone();

    public Prototype(){

    };
    public Prototype(Prototype p) {
        this.name = p.name;
    }
}
