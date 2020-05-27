package com.yiwa.structure_type.proxy.staticProxy;

public class AccountServiceImpl implements IAccountService {
    @Override
    public void transfer() {
        System.out.println("调用dao层完成转账主业务");
    }
}
