package com.restep.factory.simplefactory;

/**
 * @author restep
 * @date 2019/4/18
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        Car audi = CarFactory.createCar("奥迪");
        Car byd = CarFactory.createCar("比亚迪");

        audi.run();
        byd.run();

        Car audi2 = CarFactory.createAudi();
        Car byd2 = CarFactory.createByd();
        audi2.run();
        byd2.run();
    }
}

class CarFactory {
    public static Car createCar(String which) {
        if ("奥迪".equals(which)) {
            return new Audi();
        } else if ("比亚迪".equals(which)) {
            return new Byd();
        }

        return null;
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}