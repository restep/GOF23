package com.restep.state;

/**
 * 已预订状态
 *
 * @author restep
 * @date 2019/4/22
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已预订！别人不能定！");
    }
}
