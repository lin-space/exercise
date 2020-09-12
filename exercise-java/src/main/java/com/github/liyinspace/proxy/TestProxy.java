package com.github.liyinspace.proxy;

import sun.misc.ClassLoaderUtil;

import java.lang.reflect.Proxy;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 * @Date 2020/8/23
 * @Time 17:36
 * @Version 1.0
 */
public class TestProxy {

    public static void main(String[] args) {

        JDKProxy proxy = new JDKProxy(new RealHello());

        ClassLoader classLoader =  ClassLoader.getSystemClassLoader();

        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        // 生成代理类

        Hello test = (Hello) Proxy.newProxyInstance(classLoader, new Class[]{Hello.class}, proxy);
        // 方法调用
        System.out.println(test.sayHello());

    }
}
