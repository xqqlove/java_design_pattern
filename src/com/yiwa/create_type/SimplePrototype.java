package com.yiwa.create_type;
//原型模式（Prototype Pattern）
public class SimplePrototype  implements Cloneable ,Prototype1{
    int value;
    @Override
    public Object cloneSelf() {
        SimplePrototype self=new SimplePrototype();
        self.value=value;
        return self;
    }

    public static void main(String[] args) {
        SimplePrototype simplePrototype=new SimplePrototype();
        simplePrototype.value=500;
        SimplePrototype simplePrototype1= (SimplePrototype) simplePrototype.cloneSelf();
        System.out.println(simplePrototype1.value);
    }
}
interface Prototype1{
    Object cloneSelf();
}