package com.restep.adapter;

/**
 * @author restep
 * @date 2019/7/3
 */
public class AdapterTest {
    public void test1(Target target) {
        target.handleRequest();
    }

    public static void main(String[] args) {
        AdapterTest client = new AdapterTest();

        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        client.test1(target);
    }
}
