package com.restep.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author restep
 * @date 2019/4/21
 */
public class StarHandler implements InvocationHandler {
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;

        System.out.println("真正的方法执行前！");
        System.out.println("面谈，签合同，预付款，订机票");

        if ("sing".equals(method.getName())) {
            object = method.invoke(realStar, args);
        }

        System.out.println("真正的方法执行后！");
        System.out.println("收尾款");
        return object;
    }
}
