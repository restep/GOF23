package com.restep.singleton;

/**
 * 饿汉式单例模式
 *
 * @author restep
 * @date 2019/4/16
 */
public class HungerSingletonTest {
    public static void main(String[] args) {
        HungerSingleton instance1 = HungerSingleton.getInstance();
        HungerSingleton instance2 = HungerSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class HungerSingleton {
    /**
     * 私有的默认构造函数 保证外界无法直接实例化
     * static变量会在类装载时初始化 此时不会涉及多个线程访问该对象
     * 因此饿汉式是线程安全的
     */
    private static HungerSingleton instance = new HungerSingleton();

    /**
     * 私有的默认构造函数
     */
    private HungerSingleton() {

    }

    /**
     * 如果只是加载本类 而不是调用getInstance()
     * 甚至永远没有调用 会造成资源浪费
     * @return
     */
    public static HungerSingleton getInstance() {
        return instance;
    }
}
