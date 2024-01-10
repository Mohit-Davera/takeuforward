package testing.doubts.one;

public interface Doubtable {

    Doubtable d = null;
    String printDoubt();

    default void helloDoubt(){
        this.printDoubt();
    }
}
