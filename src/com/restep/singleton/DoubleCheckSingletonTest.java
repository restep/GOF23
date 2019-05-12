package com.restep.singleton;

/**
 * 双重检测实现单例
 *
 * @author restep
 * @date 2019/4/17
 */
public class DoubleCheckSingletonTest {
    public static void main(String[] args) {
        DoubleCheckSingleton s1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton s2 = DoubleCheckSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {

    }

    /**
     * 将同步下放到if内部 只有第一次才会同步
     * 由于编译器优化原因和JVM底层内部模型原因 两个同步块的顺序会调整
     * 偶尔会出问题 不建议使用
     *
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            DoubleCheckSingleton doubleCheckSingleton;
            synchronized (DoubleCheckSingleton.class) {
                doubleCheckSingleton = instance;

                if (null == doubleCheckSingleton) {
                    synchronized (DoubleCheckSingleton.class) {
                        if (null == doubleCheckSingleton) {
                            doubleCheckSingleton = new DoubleCheckSingleton();
                        }
                    }

                    instance = doubleCheckSingleton;
                }
            }
        }

        return instance;
    }
}
