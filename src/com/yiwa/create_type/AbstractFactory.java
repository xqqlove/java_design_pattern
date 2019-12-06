package com.yiwa.create_type;

interface HeadSet{
    void play();
}
interface MeiZuPhone{
    void run();
}
class MX5 implements MeiZuPhone{

    @Override
    public void run() {
        System.out.println("制造手机MX5一台");
    }
}
class MX6 implements MeiZuPhone{

    @Override
    public void run() {
        System.out.println("制造手机MX6一台");
    }
}
class EP20 implements HeadSet{

    @Override
    public void play() {
        System.out.println("制造耳机EP20一台，并播放音乐！");
    }
}
class EP21 implements HeadSet{

    @Override
    public void play() {
        System.out.println("制造耳机EP21一台，并播放音乐！");
    }
}
interface NBFactory{
    MeiZuPhone producePhone();
    HeadSet produceHeadSet();
}
class BigFactory implements NBFactory{

    @Override
    public MeiZuPhone producePhone() {
        return new MX5();
    }

    @Override
    public HeadSet produceHeadSet() {
        return new EP20();
    }
}
class SimallFactory implements NBFactory{

    @Override
    public MeiZuPhone producePhone() {
        return new MX6();
    }

    @Override
    public HeadSet produceHeadSet() {
        return new EP21();
    }
}
public class AbstractFactory {
    public static void main(String[] args) {
        NBFactory f1=new BigFactory();
        NBFactory f2=new SimallFactory();
        f1.produceHeadSet().play();
        f1.producePhone().run();
        f2.produceHeadSet().play();
        f2.producePhone().run();

    }
}
