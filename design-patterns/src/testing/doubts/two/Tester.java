package testing.doubts.two;

public class Tester {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();


        Parent pc = new Child();

        System.out.println(p.NAME + " " + c.NAME + " " + pc.NAME);
        System.out.println(p.printName() + "##" + c.printName() + "##" + pc.printName());
    }
}
