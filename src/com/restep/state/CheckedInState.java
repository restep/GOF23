package com.restep.state;

/**
 * 已入住状态
 *
 * @author restep
 * @date 2019/4/22
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住！请勿打扰！");
    }
}
