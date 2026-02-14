package designpatterns_v2.structural.bridge.shape;

import designpatterns_v2.structural.bridge.color.Color;

import java.util.Optional;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract double getArea();

    public String draw() {
        return "Drawing shape in " + color.getColor();
    }
}

