package factorymethodtest;

import factorymethod.Sender;
import factorymethod.StaticSendFactory;

/**
* @author arron
* 2016年9月9日上午11:52:52
* desc:null
*/
public class StaticSendFactoryTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Sender sender = StaticSendFactory.produceMail();
        sender.Send();
    }

}
