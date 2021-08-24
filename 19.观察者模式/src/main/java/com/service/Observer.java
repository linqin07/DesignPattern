package com.service;

import com.pojo.User;

/**
 * Description:
 * author: 林钦
 * date: 2019/11/04
 */
public interface Observer {
    void register(User user);

    void remove(User user);

    void notifyUser(String message);
}
