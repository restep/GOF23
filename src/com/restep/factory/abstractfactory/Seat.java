package com.restep.factory.abstractfactory;

/**
 * @author restep
 * @date 2019/4/18
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {
    @Override
    public void massage() {
        System.out.println("LuxurySeat massage()");
    }
}

class LowSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("LowSeat massage()");
    }
}
