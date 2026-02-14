package designpatterns_v2.structural.bridge.shape;

import designpatterns_v2.structural.bridge.color.Color;

public class Square extends Shape{
    private int x;

    public Square(int x) {
        super(null);
        this.x = x;
    }

    public Square(int x, Color color){
        super(color);
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return x * x;
    }
}
