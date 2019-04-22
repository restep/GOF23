package com.restep.mediator;

/**
 * 同事类的接口
 *
 * @author restep
 * @date 2019/4/22
 */
public interface Department {
    /**
     * 做本部门的事情
     */
    void selfAction();

    /**
     * 向总经理发出申请
     */
    void outAction();
}
