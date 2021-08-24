package com;

/**
 * @Description:
 * 获取实例是判断一下是否为空，空就创建一个。有需要是再创建（懒）
 * 缺点：非线程安全。有并发时会可能会有多个实例。
 * @author: LinQin
 * @date: 2021/06/03
 */
public class SingletonLan {
    public SingletonLan singletonLan;
    private SingletonLan() {
    }

    public SingletonLan getInstance() {
        if (singletonLan == null) {
            return new SingletonLan();
        }
        return singletonLan;
    }
}
