package com.restep.mediator;

/**
 * @author restep
 * @date 2019/4/22
 */
public interface Mediator {
    void register(String name, Department d);

    void command(String name);

}
