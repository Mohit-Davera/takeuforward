package designpatterns.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){};

    private static class BillPughSingletonInner{
        private static BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonInner.billPughSingleton;
    }
}
