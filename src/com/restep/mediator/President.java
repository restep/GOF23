package com.restep.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author restep
 * @date 2019/4/22
 */
public class President implements Mediator {
    private Map<String, Department> map = new HashMap<>();

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }

    @Override
    public void register(String name, Department d) {
        map.put(name, d);
    }
}
