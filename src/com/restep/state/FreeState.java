package com.restep.state;

/**
 * 空闲状态
 *
 * @author restep
 * @date 2019/4/22
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
}
