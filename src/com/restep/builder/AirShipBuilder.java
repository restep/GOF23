package com.restep.builder;

/**
 * @author restep
 * @date 2019/4/18
 */
public interface AirShipBuilder {
    Engine builderEngine();

    OrbitalModule builderOrbitalModule();

    EscapeTower builderEscapeTower();
}
