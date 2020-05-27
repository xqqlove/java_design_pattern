package com.yiwa.structure_type.proxy.JDKProxy;

import com.yiwa.structure_type.proxy.staticProxy.IAccountService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountAdvice implements InvocationHandler {
    //目标对象
    private IAccountService target;
    public AccountAdvice(IAccountService target){
        this.target=target;
    }

    /**
     * 代理方法，每次调用目标方法时都会到这里
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        return method.invoke(target,args);
    }
    /**
     * 前置增强
     */
    private void before(){
        System.out.println("对转账人身份进行校验");
    }
}
