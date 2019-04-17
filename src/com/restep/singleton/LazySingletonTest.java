package com.restep.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 懒汉式单例模式
 *
 * @author restep
 * @date 2019/4/16
 */
public class LazySingletonTest {
    public static void main(String[] args) throws Exception {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        //通过反射破解单例模式
        Class<LazySingleton> clazz = (Class<LazySingleton>) Class.forName("com.restep.singleton.LazySingleton");
        Constructor<LazySingleton> constructor = clazz.getDeclaredConstructor(null);
        //允许访问私有变量
        constructor.setAccessible(true);

        LazySingleton instance3 = constructor.newInstance();
        LazySingleton instance4 = constructor.newInstance();
        System.out.println(instance1 == instance3);
        //instance3 和 instance4是不同的对象 违反了单例模式
        System.out.println(instance3 == instance4);

        //通过反序列化破解单例模式
        FileOutputStream fos = new FileOutputStream("D:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);

        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        LazySingleton instance5 = (LazySingleton) ois.readObject();
        //通过反序列化生成了一个新对象
        System.out.println(instance5);
    }
}

class LazySingleton implements Serializable {
    private static LazySingleton instance = null;

    /**
     * 私有的默认构造函数 保证外界无法直接实例化
     */
    private LazySingleton() {
        /**
         * 防止通过反射破解单例模式
         */
        if (null != instance) {
            throw new RuntimeException();
        }
    }

    /**
     * 延迟加载 真正使用的时候才加载 提高了资源利用率
     * 但是每次调用getInstance()都要同步 并发效率低
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }

        return instance;
    }

    /**
     * 反序列化时 会调用readResolve()返回指定的对象
     * 而不会再创建新对象
     *
     * @return
     * @throws Exception
     */
    private Object readResolve() throws Exception {
        return instance;
    }
}
