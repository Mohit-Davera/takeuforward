package interview;

public abstract class AbstractCheck {

    int id;
    boolean isCheck;

    protected AbstractCheck(int id, boolean isCheck) {
        this.id = id;
        this.isCheck = isCheck;
    }

    protected AbstractCheck(){}

    public abstract void hello();

    public abstract void hello(int i);

    public String instanceMethod() {
        return id + " " + isCheck;
    }

}
