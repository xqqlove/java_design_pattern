package com.yiwa.structure_type.decorator;

/**
 * 被装饰着
 */
public abstract class Humburger {
    protected String name;
    public String getName(){return  name;}
    public abstract double getprice();
}
