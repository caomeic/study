package com.caomei.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 🍓
 * create in 2023/2/10 9:06
 * 我想干嘛：动态代理工具类
 */
public class ProxyInvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;//得到真实角色
    }

    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (InvocationHandler) this);
    }

    // proxy : 代理类
    // method : 代理类的调用处理程序的方法对象.
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String methodName){
        System.out.println("执行了"+methodName+"方法");
    }

}
