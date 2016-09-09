package singleton;
/**
* @author arron
* 2016年9月9日下午5:09:33
* desc:调用的时候直接使用 SingletonEnum singleton=SingletonEnum.INSTANCE;
*      一半的单例模式一旦实现了序列化接口，那么就不再保持单例。因为readObject()方法一直返回一个新的对象，就像构造方法一样。
*/
public enum SingletonEnum {
    INSTANCE;
}
