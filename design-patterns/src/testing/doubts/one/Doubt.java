package testing.doubts.one;

public class Doubt implements Doubtable{
    @Override
    public String printDoubt() {
        System.out.println("Parent Doubt Called");
        return "Parent";
    }
}
