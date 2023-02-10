package com.caomei.daili2;

/**
 * @author 🍓
 * create in 2023/2/10 9:27
 * 我想干嘛：自己写一个切入类
 */
public class DiyPointcut {
    public void before(){
        System.out.println("---------方法执行前---------");
    }
    public void after(){
        System.out.println("---------方法执行后---------");
    }
}
