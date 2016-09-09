package adapter;

/**
 * @author arron 2016年9月9日下午7:15:40 desc:适配器类
 */
public class Adapter implements Target {
    // 持有需要被适配的就扣对象
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        // 构造方法，传入需要被适配的对象
        // TODO Auto-generated constructor stub
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // TODO Auto-generated method stub
        adaptee.specificRequest();
    }

}
