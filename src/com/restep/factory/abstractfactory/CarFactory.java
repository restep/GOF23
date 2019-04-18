package com.restep.factory.abstractfactory;

/**
 * @author restep
 * @date 2019/4/18
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
