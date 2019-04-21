package com.restep.decorator;

/**
 * 装饰模式
 * @author restep
 * @date 2019/4/21
 */
public class DecoratorTest {
    public static void main(String[] args) {
        WaterCar waterCar = new WaterCar(new FlyCar(new Car()));
        waterCar.move();
    }
}
