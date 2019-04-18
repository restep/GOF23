package com.restep.factory.factorymethod;

/**
 * @author restep
 * @date 2019/4/18
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Car audi = new AudiFactory().create();
        Car byd = new BydFactory().create();
        Car benz = new BenzFactory().create();

        audi.run();
        byd.run();
        benz.run();
    }
}
