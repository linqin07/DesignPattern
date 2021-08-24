package com;

/**
 * @Description:双重校验锁
 * @author: LinQin
 * @date: 2018/10/22
 */
public class Sington {
    // 保证原子可见性
    private static volatile Sington sington = null;

    //私有化构造函数
    private Sington() {
    }

    public Sington getInstance() {
        // 双重校验锁
        if (sington == null) {
            synchronized (Sington.class) {
                if (sington == null) {
                    sington = new Sington();
                }
            }
        }
        return sington;
    }

}
