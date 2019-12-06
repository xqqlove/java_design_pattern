package com.yiwa.create_type;

class SimpleSingleton {

    // 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 *
    private static SimpleSingleton instance;

    /* 私有构造方法，防止被实例化 */
    private SimpleSingleton() {
    }

    /* 静态工程方法，创建实例 */
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}

/**
 * 这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，
 * 肯定就会出现问题了，如何解决？
 */

public class SingletonPattern {
    public static void main(String[] args) {
        SimpleSingleton simpleSingleton=SimpleSingleton.getInstance();
    }
}
