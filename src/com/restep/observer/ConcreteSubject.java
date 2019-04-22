package com.restep.observer;

/**
 * @author restep
 * @date 2019/4/22
 */
public class ConcreteSubject extends Subject {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//主题对象(目标对象)值发生了变化，请通知所有的观察者
		this.notifyAllObservers();
	} 
}
