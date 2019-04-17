package com.restep.singleton;

/**
 * 双重检测实现单例
 *
 * @author restep
 * @date 2019/4/17
 */
public class SynchronizedSingletonTest {
    public static void main(String[] args) {
        SynchronizedSingleton s1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton s2 = SynchronizedSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class SynchronizedSingleton {
    private static SynchronizedSingleton instance = null;

    private SynchronizedSingleton() {

    }

    /**
     * 将同步下放到if内部 只有第一次才会同步
     * 由于编译器优化原因和JVM底层内部模型原因 两个同步块的顺序会调整
     * 偶尔会出问题 不建议使用
     *
     * @return
     */
    public static SynchronizedSingleton getInstance() {
        if (null == instance) {
            SynchronizedSingleton sc;
            synchronized (SynchronizedSingleton.class) {
                sc = instance;

                if (null == sc) {
                    synchronized (SynchronizedSingleton.class) {
                        if (null == sc) {
                            sc = new SynchronizedSingleton();
                        }
                    }

                    instance = sc;
                }
            }
        }

        return instance;
    }
}
