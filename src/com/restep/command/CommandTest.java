package com.restep.command;

/**
 * 命令模式
 * @author restep
 * @date 2019/4/22
 */
public class CommandTest {
	public static void main(String[] args) {
		Command c = new ConcreteCommand(new Receiver());
		Invoke i = new Invoke(c);
		i.call();
	}
}
