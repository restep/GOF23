package com.restep.factory.abstractfactory;

/**
 * @author restep
 * @date 2019/4/18
 */
public interface Engine {
    void run();

    void start();
}

class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("LuxuryEngine run()");
    }

    @Override
    public void start() {
        System.out.println("LuxuryEngine start()");
    }
}

class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("LowEngine run()");
    }

    @Override
    public void start() {
        System.out.println("LowEngine start()");
    }
}
