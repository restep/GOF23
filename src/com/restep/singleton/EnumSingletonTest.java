package com.restep.singleton;

/**
 * 枚举实现单例模式
 * @author restep
 * @date 2019/4/17
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum EnumSingleton {
    /**
     * 枚举本身就是单例模式
     * 由JVM从根本上提供保障 避免通过反射和反序列化的漏洞
     * 缺点是无延迟加载
     */
    INSTANCE
}
