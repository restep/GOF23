package com.restep.strategy;

/**
 * @author restep
 * @date 2019/4/22
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
}
