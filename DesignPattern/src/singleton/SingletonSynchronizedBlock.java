package singleton;
/**
* @author arron
* 2016年9月9日下午4:40:35
* desc:instance=new SingletonSynchronizedBlock();是分两步执行的，有可能导致线程在离开时instance没有被实例化
*/
public class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock instance=null;
    private SingletonSynchronizedBlock(){};

    public static SingletonSynchronizedBlock getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronizedBlock.class) {
                if (instance == null) {
                    instance = new SingletonSynchronizedBlock();
                }

            }
        }
        return instance;
    }
}
