package designpatterns_v2.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private final List<Graphic> graphics;

    @Override
    public void move(int x, int y) {
        graphics.forEach((g) -> g.move(x,y));
    }

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }

    public void addGraphic(Graphic g) {
        graphics.add(g);
    }

    public void removeGraphic(Graphic g){
        graphics.remove(g);
    }

    public CompoundGraphic() {
        this.graphics = new ArrayList<>();
    }
}
