package testing.doubts.three;

public abstract class Shape {

    private String shapeName;

    abstract double getArea();
    private void print(){
        System.out.println("This is shape class");
    }

    private void printName(){
        System.out.println(this.shapeName);
    }
}
