package com.restep.strategy;

/**
 * @author restep
 * @date 2019/4/22
 */
public class StrategyTest {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerManyStrategy();
        Context ctx = new Context(s1);

        ctx.pringPrice(998);
    }
}
