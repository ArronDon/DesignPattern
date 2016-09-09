package observer;

/**
 * @author arron 
 * 2016年9月9日下午10:34:50 
 * desc:具体主题角色类
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        this.notifyObservers(newState);
    }
}
