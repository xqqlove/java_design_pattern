package com.yiwa.structure_type.proxy.JDKProxy;

import com.yiwa.structure_type.proxy.staticProxy.AccountServiceImpl;
import com.yiwa.structure_type.proxy.staticProxy.IAccountService;

import java.lang.reflect.Proxy;

public class TestJDKProxy {
    public static void main(String[] args) {
        //创建目标对象
        IAccountService target=new AccountServiceImpl();
        //创建代理对象
        IAccountService proxy= (IAccountService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new AccountAdvice(target));
        proxy.transfer();
    }
}
