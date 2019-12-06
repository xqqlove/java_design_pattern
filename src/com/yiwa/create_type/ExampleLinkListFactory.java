package com.yiwa.create_type;



//简陋的单向链表list
class LinkList<T> implements List<T> {
    private int size;//存放的元素个数,会默认初始化为0
    private Node<T> first; //首节点，默认初始化为null

    //链表节点
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public boolean add(T t) {
        if (size == 0) {
            first = new Node<T>(t, null);
            size++;
            return true;
        }
        Node<T> node = first;
        while (node.next != null)
            node = node.next;
        node.next = new Node<T>(t, null);
        size++;
        return true;
    }

    class MyIterator implements Iterator<T> {
        private Node<T> node;
        MyIterator(){
            node=first;
        }
        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public T next() {
            T data=node.data;
            node=node.next;
            return data;
        }
    }
}

public class ExampleLinkListFactory {
    public static void main(String[] args) {
        List<Integer> list=new LinkList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
