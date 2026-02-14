package designpatterns_v2.structural.composite;

public class Line extends BaseShape{
    private int length;

    public Line(int x, int y, int radius) {
        super(x,y);
        this.length = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line at " + super.getX() + ", " + super.getY() + " With Length " + this.length);
    }
}
