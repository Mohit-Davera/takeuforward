package designpatterns_v2.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ImageEditor {
    public static void main(String[] args) {
        Graphic dot = new Dot(10,20);
        Graphic circle = new Circle(10,20,15);
        Graphic line = new Line(10,20,5);

        CompoundGraphic cg = new CompoundGraphic();
        cg.addGraphic(dot);
        cg.addGraphic(line);
        cg.addGraphic(circle);

        cg.draw();
    }
}
