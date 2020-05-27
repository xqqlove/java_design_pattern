package com.yiwa.structure_type.proxy.staticProxy;

public class AccountProxy implements  IAccountService {
    private IAccountService iAccountService;//目标对象

    public AccountProxy(IAccountService iAccountService){
        this.iAccountService=iAccountService;
    }

    /**
     * 代理方法 实现对目标方法的功能增强
     */
    @Override
    public void transfer() {
        before();
        iAccountService.transfer();
    }

    /**
     * 前置增强
     */
    public void before(){
        System.out.println("对转账人身份进行校验");
    }
}
