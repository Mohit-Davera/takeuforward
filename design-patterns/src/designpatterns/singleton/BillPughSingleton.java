package designpatterns.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){};

    private static class BillPughSingletonInner{
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonInner.billPughSingleton;
    }
}
