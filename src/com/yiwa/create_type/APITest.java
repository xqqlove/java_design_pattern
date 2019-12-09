package com.yiwa.create_type;
//使用 java 自带的支持

//一个可以复制的对象
class MyObject implements Cloneable{
    int i;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class APITest {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyObject myObject=new MyObject();
        myObject.i=5;
        MyObject myObject1= (MyObject) myObject.clone();
        System.out.println(myObject1.i);
    }
}
