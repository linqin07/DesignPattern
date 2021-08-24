package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public class Adapter extends TypeC implements Mobile {
    @Override
    public void charge() {
        super.request();
        System.out.println("充电");
    }
}
