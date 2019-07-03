package com.restep.adapter;

/**
 * 适配器
 *
 * @author restep
 * @date 2019/7/3
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter() {

    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
