package com.restep.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author restep
 * @date 2019/4/22
 */
public class CareTaker {
	private EmpMemento memento;

//private List<EmpMemento> list = new ArrayList<EmpMemento>();
	
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
}