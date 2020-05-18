package com.yiwa.structure_type.decorator;

public class Decorator_zero extends Decorator {
    public Decorator_zero(Human human) {
        super(human);
    }
    public void goHome(){
        System.out.println("进房子。。。");
    }
    public void findMap(){
        System.out.println("书房找找map。。。");
    }
    public void wearClothes(){
        super.wearClothes();
        goHome();
    }
    public void walkToWhere(){
        super.walkToWhere();
        findMap();
    }
}
