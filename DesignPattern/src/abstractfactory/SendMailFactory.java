package abstractfactory;
/**
* @author arron
* 2016年9月9日上午11:59:03
* desc:null
*/
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        // TODO Auto-generated method stub
        return new MailSender();
    }

}
