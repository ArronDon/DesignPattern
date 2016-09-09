package singleton;

/**
 * @author arron 2016年9月9日下午4:17:20 desc:构造方法私有防止被实例化，但这种实现方式无法保证线程安全
 */
public class SingletonBase {
    private static SingletonBase instance = null;

    private SingletonBase() {
        // TODO Auto-generated constructor stub
    }

    public static SingletonBase getInstance() {
        if (instance == null) {
            instance = new SingletonBase();
        }
        return instance;
    }
}
