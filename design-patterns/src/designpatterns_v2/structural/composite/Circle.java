package designpatterns_v2.structural.composite;

public class Circle extends BaseShape{

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at " + super.getX() + ", " + super.getY() + " With Radius " + this.radius );
    }
}
