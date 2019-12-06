package com.yiwa.create_type;
//===========================================简单工厂模式=============================================
//抽象产品
interface HuaWeiPhone{
    void run();
}
//具体产品1
class Nova5 implements HuaWeiPhone{

    @Override
    public void run() {
        System.out.println("生产了一台华为NOVA5");
    }
}
//具体产品2
class Honor implements HuaWeiPhone{

    @Override
    public void run() {
        System.out.println("生产了一台华为HONOR");
    }
}
//工厂
class Factory{
    HuaWeiPhone pruduce(String product) throws Exception{
        if (product.equals("Nova5")){
            return new Nova5();
        }else if(product.equals("Honor")){
            return new Honor();
        }
        throw new Exception("No such Class");
    }
}
//===========================================简单工厂模式=============================================

//===========================================工厂模式=============================================
//抽象产品
interface MIPhone{
    void run();
}
//抽象工厂
interface MIFactory{
    MIPhone produce();
}
//具体产品1
class MI1s implements MIPhone{

    @Override
    public void run() {
        System.out.println("小米1s");
    }
}
//具体产品2
class RedMI implements MIPhone{

    @Override
    public void run() {
        System.out.println("红米");
    }
}
//产品1的工厂
class MI1sFactory implements MIFactory{

    @Override
    public MIPhone produce() {
        return new MI1s();
    }
}
//产品2的工厂
class RedMIFactory implements MIFactory{

    @Override
    public MIPhone produce() {
        return new RedMI();
    }
}
//===========================================工厂模式=============================================
public class FactoryMethodPattern {

    public static void main(String[] args) throws Exception{
        //======================测试简单工厂模式======================================
        Factory factory=new Factory();
        factory.pruduce("Nova5").run();
        factory.pruduce("Honor").run();
        factory.pruduce("Honor").run();
        //======================测试简单工厂模式======================================

        //===========================================工厂模式=============================================
        MIFactory fact=new MI1sFactory();
        MIFactory factory1=new RedMIFactory();
        factory1.produce().run();
        fact.produce().run();

    }
}
