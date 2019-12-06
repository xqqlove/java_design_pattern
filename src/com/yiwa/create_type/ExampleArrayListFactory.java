package com.yiwa.create_type;

import javax.swing.*;

//只是需要遍历一堆数据，那么只需要2个方法就可以了
interface Iterator<T>{
    boolean hasNext();//是否还有下一个元素
    T next();//得到下一个元素
}

interface List<T>{
    Iterator<T> iterator();//返回一个遍历器
    boolean add(T t);//添加元素到列表
}

class ArrayList<T> implements List<T>{
    private int size;//存放的元素个数,会默认初始化为0
    private Object[] defaultList;//使用数组存放元素
    private static final int defaultLength=10;//默认长度
    public ArrayList(){
        defaultList=new Object[defaultLength];
    }//默认构造函数

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public boolean add(T t) {
        if (size<=defaultLength){
            defaultList[size++]=t;
            return true;
        }
        return false;
    }

    private class MyIterator implements Iterator<T>{
        private int next;
        @Override
        public boolean hasNext() {
            return next<size;
        }

        @Override
        public T next() {
            return (T)defaultList[next++];
        }
    }
}

public class ExampleArrayListFactory {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<8;i++){
            arrayList.add(i);
        }
        Iterator<Integer> it=arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
