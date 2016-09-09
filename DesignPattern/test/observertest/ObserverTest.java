package observertest;

import observer.ConcreteObserver;
import observer.ConcreteSubject;
import observer.Observer;

/**
 * @author arron 
 * 2016年9月9日下午10:40:35 
 * desc:main方法
 */
public class ObserverTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建主题对象
        ConcreteSubject subject=new ConcreteSubject();
        //创建观察者对象
        Observer observer=new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }

}
