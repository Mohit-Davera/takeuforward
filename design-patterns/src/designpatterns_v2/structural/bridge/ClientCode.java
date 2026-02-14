package designpatterns_v2.structural.bridge;

import designpatterns_v2.structural.bridge.color.Blue;
import designpatterns_v2.structural.bridge.color.Color;
import designpatterns_v2.structural.bridge.color.Red;
import designpatterns_v2.structural.bridge.shape.Circle;
import designpatterns_v2.structural.bridge.shape.Shape;
import designpatterns_v2.structural.bridge.shape.Square;

import java.awt.geom.Area;

public class ClientCode {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Shape circle = new Circle(10,red);
        Shape square = new Square(5,blue);


        System.out.println(circle.draw());
        System.out.println(square.draw());



    }
}
