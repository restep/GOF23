package com.restep.templatemethod;

/**
 * @author restep
 * @date 2019/4/22
 */
public abstract class BankTemplateMethod {
    /**
     * 模板方法
     */
    public final void process() {
        this.takeNumber();

        this.transact();

        this.evaluate();
    }

    /**
     * 具体方法
     */
    public void takeNumber() {
        System.out.println("取号排队");
    }

    /**
     * 办理具体的业务	钩子方法
     */
    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分");
    }
}
