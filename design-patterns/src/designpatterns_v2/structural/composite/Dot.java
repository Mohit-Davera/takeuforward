package designpatterns_v2.structural.composite;

public class Dot extends BaseShape {

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dot(int x, int y) {
        super(x,y);
    }

    @Override
    public void draw() {
        System.out.println("Dot is Drawn at " + this.x + ", " + this.y);
    }
}
