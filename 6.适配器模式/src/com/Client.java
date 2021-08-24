package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public class Client {
    public static void main(String[] args) {
        Mobile mobile = new Adapter();
        mobile.charge();
    }
}
