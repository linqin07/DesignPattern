package com.service;

import com.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/11/04
 */
public class Server implements Observer {
    private List<User> userList = new ArrayList<>();

    @Override
    public void register(User user) {
        userList.add(user);
        System.out.println(user.getName() + "订阅");
    }

    @Override
    public void remove(User user) {
        userList.remove(user);
        System.out.println(user.getName() + "取消订阅");
    }

    @Override
    public void notifyUser(String message) {
        if (userList.size() == 0 ) return;
        userList.forEach(item -> {
            item.setMessage(message);
            item.read();
        });
    }
}
