package com.restep.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author restep
 * @date 2019/4/21
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class}, handler);

        proxy.sing();
    }
}
