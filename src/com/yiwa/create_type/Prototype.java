package com.yiwa.create_type;

public class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        Prototype proto= (Prototype) super.clone();
        return proto;
    }
}
