package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author arron 
 * 2016年9月9日下午10:25:00 
 * desc:抽象主题角色类
 */
public class Subject {
    // 用来保存注册的观察者对象
    private List<Observer> list = new ArrayList<Observer>();

    // 注册观察者对象
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer");
    }

    // 删除观察者对象
    public void detach(Observer observer) {
        list.remove(observer);
    }

    // 通知所有注册的观察者对象
    public void notifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }
}
