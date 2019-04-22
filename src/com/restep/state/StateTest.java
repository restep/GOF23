package com.restep.state;

/**
 * @author restep
 * @date 2019/4/22
 */
public class StateTest {
    public static void main(String[] args) {
        HomeContext ctx = new HomeContext();

        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}
