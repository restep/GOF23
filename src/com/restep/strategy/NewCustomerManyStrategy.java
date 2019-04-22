package com.restep.strategy;

/**
 * @author restep
 * @date 2019/4/22
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice * 0.9;
    }
}
