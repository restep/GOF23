package com.restep.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程下五种实现单例的效率
 * HungerSingleton       15ms
 * LazySingleton         67.6ms
 * InnerClassSingleton   16.3ms
 * SynchronizedSingleton 14ms
 * EnumSingleton         8.6ms
 *
 * @author restep
 * @date 2019/4/17
 */
public class FiveSingletonTest {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        HungerSingleton instance = HungerSingleton.getInstance();
                    }

                    countDownLatch.countDown();
                }
            }).start();
        }
        //main线程阻塞 直到计数器为0 才会继续往下执行
        countDownLatch.await();

        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end - start));
    }
}
