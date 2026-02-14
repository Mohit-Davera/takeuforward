package designpatterns_v2.creational.singleton;

public class SingletonSynchronizedBlock {

    private static SingletonSynchronizedBlock instance;
    private SingletonSynchronizedBlock(){

    }

    public static synchronized SingletonSynchronizedBlock getInstance() {
        if(instance == null){
            synchronized (SingletonSynchronizedBlock.class){
                if(instance == null)
                    instance = new SingletonSynchronizedBlock();
            }
        }
        return instance;
    }
}
