package com.yiwa.create_type;


import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

interface IIterator<T> {
    boolean hasNext();

    Object next();
}

interface IIteratorFactory<T> {
    IIterator<T> iteratorMap(Map<T, Object> m);

    IIterator<T> iteratorCollection(Collection<T> c);
}

//具体产品，Collection迭代器(用到了代理模式)
class IteratorCollection<T> implements IIterator<T> {
    Iterator<T> iterator;

    public IteratorCollection(Collection<T> t) {
        iterator = t.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
}

//具体产品，Map迭代器(用到了代理模式)
class IteratorMap<T> implements IIterator<T> {
    Iterator<Map.Entry<T, Object>> iterator;

    IteratorMap(Map<T, Object> m) {
        iterator = m.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next().getValue();
    }
}

//具体工厂
class IteratorFactory<T> implements IIteratorFactory<T> {

    @Override
    public IIterator<T> iteratorMap(Map<T, Object> m) {
        return new IteratorMap<T>(m);
    }

    @Override
    public IIterator<T> iteratorCollection(Collection<T> c) {
        return new IteratorCollection<T>(c);
    }
}

public class ExampleAbstractFactory {
    public static void main(String[] args) {
        IIteratorFactory<Integer> factory = new IteratorFactory<>();
        Collection<Integer> collection = new ArrayList<>();
        Map<Integer, Object> map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
            map.put(i, i);
        }
        IIterator<Integer> it = factory.iteratorCollection(collection);
        IIterator<Integer> it1 = factory.iteratorMap(map);
        while (it.hasNext())
            System.out.println("collection:" + it.next());
        while (it1.hasNext()) System.out.println("Map:" + it1.next());
    }
}
