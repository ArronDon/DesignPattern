package singleton;
/**
* @author arron
* 2016年9月9日下午5:11:49
* desc:静态工厂方法实现 推荐
*/
public class SingletonStaticFactory {
    //initialized during class loading
    private static final SingletonStaticFactory INSTANCE=new SingletonStaticFactory();

    // to prevent creating another instance of Singleton
    private SingletonStaticFactory(){};
    
    public static SingletonStaticFactory getInstance() {
        return INSTANCE;
    }
}
