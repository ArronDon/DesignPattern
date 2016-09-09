package factorymethodtest;

import factorymethod.OrdinarySendFacoty;
import factorymethod.Sender;

public class OrdinaryFactoryTest {
    public static void main(String[] args) {
        OrdinarySendFacoty facoty = new OrdinarySendFacoty();
        Sender sender = facoty.produce("sms");
        sender.Send();
    }
}
