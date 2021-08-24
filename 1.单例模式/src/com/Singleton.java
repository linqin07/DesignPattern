package com;

/**
 * @Description: 饿汉式, 线程安全，类加载就初始化好了，不是懒加载.
 * @author: LinQin
 * @date: 2018/10/22
 */
public class Singleton {
    private final static Singleton SINGLETON = new Singleton();

    //私有化构造函数
    private Singleton() {
    }

    public Singleton getInstance() {
        return SINGLETON;
    }

}
