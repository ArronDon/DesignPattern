package abstractfactory;
/**
* @author arron
* 2016年9月9日下午12:00:53
* desc:null
*/
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        // TODO Auto-generated method stub
        return new SmsSender();
    }

}
