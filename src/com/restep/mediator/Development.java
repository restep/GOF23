package com.restep.mediator;

/**
 * @author restep
 * @date 2019/4/22
 */
public class Development implements Department {
    /**
     * 持有中介者(总经理)的引用
     */
    private Mediator m;

    public Development(Mediator m) {
        super();
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目！");
    }
}
