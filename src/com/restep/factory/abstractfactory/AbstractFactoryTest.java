package com.restep.factory.abstractfactory;

/**
 * @author restep
 * @date 2019/4/18
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();

        Engine engine = factory.createEngine();
        engine.run();
        engine.start();

        Seat seat = factory.createSeat();
        seat.massage();

        Tyre tyre = factory.createTyre();
        tyre.revolve();

        factory = new LowCarFactory();

        engine = factory.createEngine();
        engine.run();
        engine.start();

        seat = factory.createSeat();
        seat.massage();

        tyre = factory.createTyre();
        tyre.revolve();
    }
}
