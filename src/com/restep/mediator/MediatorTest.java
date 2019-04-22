package com.restep.mediator;

/**
 * 中介者模式
 *
 * @author restep
 * @date 2019/4/22
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
