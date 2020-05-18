package com.yiwa.structure_type.decorator;

public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢？？？");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢？？？？");
    }


    public static void main(String[] args) {
        Human person=new Person();
        Decorator decorator=new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
