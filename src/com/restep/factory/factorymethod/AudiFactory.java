package com.restep.factory.factorymethod;

/**
 * @author restep
 * @date 2019/4/18
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car create() {
        return new Audi();
    }
}
