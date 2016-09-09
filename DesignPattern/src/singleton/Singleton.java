package singleton;

/**
 * @author arron 
 * 2016年9月9日下午4:52:21
 * desc:使用内部类来维护单例的实现，JVM内部机制保证一个类被加载时，类的加载过程是线程互斥的
 *      第一次调用getInstance的时候，能够保证instance只被创建一次，而且会把复制给instance的内存初始化完毕
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }
}
