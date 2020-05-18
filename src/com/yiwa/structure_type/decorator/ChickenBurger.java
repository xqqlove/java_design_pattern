package com.yiwa.structure_type.decorator;

public class ChickenBurger extends Humburger {

    public ChickenBurger(){
        name="鸡腿堡";
    }

    @Override
    public double getprice() {
        return 10;
    }
}
