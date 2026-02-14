package designpatterns_v2.creational.prototype;

public class PrototypeA extends Prototype{
    private int size;

    public PrototypeA(String name,int size) {
        this.name = name;
        this.size = size;
    }

    public PrototypeA(PrototypeA a) {
        super(a);
        this.size = a.size;
    }

    @Override
    public PrototypeA clone() {
        return new PrototypeA(this);
    }
}
