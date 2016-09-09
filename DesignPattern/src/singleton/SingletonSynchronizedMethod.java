package singleton;

/**
 * @author arron 
 * 2016年9月9日下午4:20:50 
 * desc:解决了多线程问题，但是效率不高。事实上只需要第一次实例化的时候保证上锁即可。
 */
public class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance=null;
    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}
