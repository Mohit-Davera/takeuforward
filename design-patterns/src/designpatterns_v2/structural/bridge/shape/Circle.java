package designpatterns_v2.structural.bridge.shape;

import designpatterns_v2.structural.bridge.color.Color;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Circle(int radius){
        super(null);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * Math.PI * radius;
    }
}
