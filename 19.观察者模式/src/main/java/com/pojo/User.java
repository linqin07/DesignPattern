package com.pojo;

import com.service.ReadMessage;
import lombok.Data;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/11/04
 */
@Data
public class User implements ReadMessage {
    private String message;
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println(name + " 接收到消息：" + message);
    }
}
