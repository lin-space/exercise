package com.github.liyinspace.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 * @Date 2020/8/23
 * @Time 17:37
 * @Version 1.0
 */
public class JDKProxy implements InvocationHandler {
    private Object target;


    public JDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ((RealHello) target).invoke();
    }
}
