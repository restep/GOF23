package com.restep.factory.simplefactory;

/**
 * 在没有工厂模式的情况下
 * @author restep
 * @date 2019/4/18
 */
public class NoFactoryTest {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car byd = new Byd();

        audi.run();
        byd.run();
    }
}
