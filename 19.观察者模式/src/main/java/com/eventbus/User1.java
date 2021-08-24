package com.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/11/05
 */
public class User1 {
    /**
     * 只有通过@Subscribe注解的方法才会被注册进EventBus
     * 而且方法有且只能有1个参数
     *
     * @param msg
     */
    @Subscribe
    public void fun1(String msg) {
        System.out.println("String msg:" + msg);
    }
}
