package com.restep.builder;

/**
 * @author restep
 * @date 2019/4/18
 */
public class AirShipDirectorImpl implements AirShipDirector {
    private AirShipBuilder builder;

    public AirShipDirectorImpl(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();

        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setOrbitalModule(orbitalModule);
        ship.setEscapeTower(escapeTower);

        return ship;
    }
}
