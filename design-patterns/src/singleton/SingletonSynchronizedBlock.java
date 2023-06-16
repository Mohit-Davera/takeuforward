package singleton;

public class SingletonSynchronizedBlock {

    private static SingletonSynchronizedBlock instance;
    private SingletonSynchronizedBlock(){

    }

    public static synchronized SingletonSynchronizedBlock getInstance() {
        if(instance == null){
            synchronized (SingletonSynchronizedBlock.class){
                instance = new SingletonSynchronizedBlock();
            }
        }
        return instance;
    }
}
