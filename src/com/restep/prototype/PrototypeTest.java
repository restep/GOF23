package com.restep.prototype;

/**
 * @author restep
 * @date 2019/4/20
 */
public class PrototypeTest {
    public static void main(String[] args) throws Exception {
        testNew(1000);
        testClone(1000);
    }

    public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Sheep sheep = new Sheep();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式创建耗时：" + (end - start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Sheep t = new Sheep();
        for (int i = 0; i < size; i++) {
            Sheep sheep = (Sheep) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone的方式创建耗时：" + (end - start));
    }
}

class Sheep implements Cloneable {
    public Sheep() {
        try {
            //模拟创建对象耗时的过程!
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
