package designpatterns_v2.creational.prototype;

public class PrototypeB extends Prototype{
    private int size;
    private int weight;

    public PrototypeB(Prototype p, int size) {
        super(p);
        this.size = size;
    }

    public PrototypeB(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public PrototypeB(PrototypeB a) {
        super(a);
        this.size = a.size;
        this.weight = a.weight;
    }

    @Override
    public Prototype clone() {
        return new PrototypeB(this);
    }
}
