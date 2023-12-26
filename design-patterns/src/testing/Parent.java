package testing;

public interface Parent {
    String name = "parent";

    default String printName(){
        return "From Parent";
    }
}
