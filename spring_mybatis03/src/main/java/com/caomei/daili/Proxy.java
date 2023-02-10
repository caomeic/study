package com.caomei.daili;

/**
 * @author 🍓
 * create in 2023/2/10 8:48
 * 我想干嘛：代理角色
 *
 */
public class Proxy {
    private Host host;
    public Proxy(){

    }
    public Proxy(Host host){
        this.host=host;
    }
    public void rent(){
        seeHouse();
        host.rent();
        hetong();
        fare();
    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void fare(){
        System.out.println("收中介费!");
    }
    public void hetong(){
        System.out.println("签租领合同");
    }
}
