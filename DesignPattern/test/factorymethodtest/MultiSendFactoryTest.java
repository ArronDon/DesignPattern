package factorymethodtest;

import factorymethod.MultiSendFactory;
import factorymethod.Sender;

public class MultiSendFactoryTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MultiSendFactory factory = new MultiSendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }

}
