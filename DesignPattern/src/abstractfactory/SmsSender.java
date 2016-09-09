package abstractfactory;

import abstractfactory.Sender;

/**
* @author arron
* 2016年9月9日上午11:57:11
* desc:null
*/
public class SmsSender implements Sender {

    @Override
    public void Send() {
        // TODO Auto-generated method stub
        System.out.println("this is sms sender!");
    }

}
