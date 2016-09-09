package adaptertest;

import adapter.Adaptee;
import adapter.Adapter;
import adapter.Target;

/**
* @author arron
* 2016年9月9日下午7:18:35
* desc:null
*/
public class AdapterTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        // 创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        target.request();
    }

}
