package abstractfactory;


/**
* @author arron
* 2016年9月9日上午11:56:51
* desc:实现类
*/
public class MailSender implements Sender {

    @Override
    public void Send() {
        // TODO Auto-generated method stub
        System.out.println("this is mailsender");
    }

}
