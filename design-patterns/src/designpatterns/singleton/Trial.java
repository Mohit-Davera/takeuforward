package designpatterns.singleton;

public class Trial {
    public static void main(String[] args) {
        SingletonEager foo = SingletonEager.getInstance("FOO");
        foo.print();

        SingletonEager bar = SingletonEager.getInstance("BAR");
        bar.print();

        foo.print();
    }
}
