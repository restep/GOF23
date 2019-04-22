package com.restep.observer;

/**
 * @author restep
 * @date 2019/4/22
 */
public class ObserverImpl implements Observer {
    /**
     * myState需要跟目标对象的state值保持一致
     */
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
    }


    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
