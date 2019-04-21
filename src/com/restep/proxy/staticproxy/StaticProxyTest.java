package com.restep.proxy.staticproxy;

/**
 * 静态代理
 * @author restep
 * @date 2019/4/21
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar = new ProxyStar(realStar);

        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collectMoney();
    }
}
