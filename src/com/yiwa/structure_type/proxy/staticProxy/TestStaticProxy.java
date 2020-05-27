package com.yiwa.structure_type.proxy.staticProxy;

import sun.rmi.runtime.NewThreadAction;

public class TestStaticProxy {
    public static void main(String[] args) {
        //创建目标对象
        IAccountService target=new AccountServiceImpl();
        //创建代理对象
        AccountProxy proxy= new AccountProxy(target);
        proxy.transfer();
    }
}
