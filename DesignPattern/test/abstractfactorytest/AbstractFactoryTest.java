package abstractfactorytest;

import abstractfactory.Provider;
import abstractfactory.SendMailFactory;
import abstractfactory.Sender;

/**
* @author arron
* 2016年9月9日下午12:03:21
* desc:null
*/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }

}
