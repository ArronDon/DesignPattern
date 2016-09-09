package singleton;
/**
* @author arron
* 2016年9月9日下午7:22:30
* desc:null
*/
public class SingletonStaticFactoryTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SingletonStaticFactory instance = SingletonStaticFactory.getInstance();
        if (instance != null) {
            System.out.println("instance is not null");
        } else {
            System.out.println("instance is null");
        }
    }

}
