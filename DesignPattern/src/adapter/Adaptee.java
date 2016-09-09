package adapter;
/**
* @author arron
* 2016年9月9日下午7:13:23
* desc:已经存在的接口，这个接口需要适配
*/
public class Adaptee {
    // 原本存在的方法
    public void specificRequest(){
        // 业务代码
        System.out.println("Adaptee specific request");
    }
}
