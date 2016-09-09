package observer;

/**
 * @author arron 
 * 2016年9月9日下午10:37:52 
 * desc:具体观察者角色类
 */
public class ConcreteObserver implements Observer {
    // 观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        // TODO Auto-generated method stub
        // 更新观察者的状态，使其与目标的状态保持一致
        observerState = state;
        System.out.println("状态为：" + observerState);
    }

}
