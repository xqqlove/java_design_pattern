package com.yiwa.structure_type.decorator;

public class Decorator_first extends Decorator {
    public Decorator_first(Human human) {
        super(human);
    }
    public void goClothespress(){
        System.out.println("去衣柜找找");
    }
    public void findPlaceOnMap(){
        System.out.println("在map上找找");
    }
    public void wearClothes(){
        super.wearClothes();
        goClothespress();
    }
    public void walkToWhere(){
        super.walkToWhere();
        findPlaceOnMap();
    }
}
