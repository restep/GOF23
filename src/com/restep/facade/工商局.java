package com.restep.facade;

/**
 * 门面模式
 * @author restep
 * @date 2019/4/21
 */
public interface 工商局 {
    void checkName();
}

class 海淀区工商局 implements 工商局 {
    @Override
    public void checkName() {
        System.out.println("检查名字是否有冲突！");
    }
}
