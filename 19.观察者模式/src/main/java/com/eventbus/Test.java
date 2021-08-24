package com.eventbus;

import com.google.common.eventbus.EventBus;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/11/05
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        //观察者
        User1 user1 = new User1();
        User2 user2 = new User2();

        // 订阅
        eventBus.register(user1);
        eventBus.register(user2);
        eventBus.post("我是字符串消息1");
        // 取消订阅
        eventBus.unregister(user1);
        eventBus.post("我是字符串消息2");
        // 匹配数字处理
        eventBus.post(100);
    }
}
