package com.caomei.daili;

import com.caomei.utils.ProxyInvocationHandler;

/**
 * @author 🍓
 * create in 2023/2/10 8:48
 * 我想干嘛：
 */
public class Client {
    public static void main(String[] args) {
        //真实对象
        Host host = new Host();
        //代理对象
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setTarget(host); // 设置需要代理的对象

        Rent proxy = (Rent) proxyInvocationHandler.getProxy();

        proxy.rent();
    }
}
