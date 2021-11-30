package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/20
 */
public class Test {
    public static void main(String[] args) {// 这是状态模式
        Context context = new Context();
        Weather rain = new Rain();
        rain.doAction(context);
        System.out.println(context.weatherMessage());

        // 下面这种是策略
        context.setWeather(new Sunshine());
        System.out.println(context.weatherMessage());
    }
}
