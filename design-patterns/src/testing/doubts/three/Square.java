package testing.doubts.three;

public class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}

