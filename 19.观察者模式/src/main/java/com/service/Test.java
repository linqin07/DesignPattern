package com.service;

import com.google.common.eventbus.EventBus;
import com.pojo.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/11/04
 */
public class Test {
    public static void main(String[] args) {
        User zhangshan = new User("zhangshan");
        User lisi = new User("lisi");
        User wangwu = new User("wangwu");

        Observer observer = new Server();
        observer.register(lisi);
        observer.register(zhangshan);

        observer.notifyUser("开饭拉");

        observer.remove(lisi);
        observer.register(wangwu);
        observer.notifyUser("收到转账100w元");

        System.out.println("------------------------------------------");



        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 11, 5, 17, 30, 10);
        System.out.println(calendar.getTime().getTime());
        System.out.println(new Date().getTime());
        calendar.set(Calendar.MILLISECOND, 0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        String format = dtf.format(calendar.toInstant());
        System.out.println(format);
        System.out.println(dtf.format(LocalDateTime.now()));


    }

}
