package com.restep.builder;

/**
 * @author restep
 * @date 2019/4/18
 */
public class BuilderTest {
    public static void main(String[] args) {
        AirShipDirector director = new AirShipDirectorImpl(new AirShipBuilderImpl());

        AirShip airShip = director.directAirShip();
        airShip.launch();
    }
}
