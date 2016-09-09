package builder;

import java.util.ArrayList;
import java.util.List;

/**
* @author arron
* 2016年9月9日下午5:45:03
* desc:null
*/
public class Builder {
    private List<Sender> list=new ArrayList<Sender>();
    public void produceMailSender(int count){
        for(int i=0;i<10;i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < 10; i++) {
            list.add(new SmsSender());
        }
    }
}
