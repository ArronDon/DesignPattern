package factorymethod;

/**
 * @author arron 
 * 2016年9月9日上午11:50:29 
 * desc:静态工厂方法，不需要创建实例，直接调用即可。
 */
public class StaticSendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
