package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/20
 */
public class Rain implements Weather {
    @Override
    public String getWeather() {
        return "rain";
    }
    @Override
    public void doAction(Context context) {
        context.setWeather(this);

    }
}

class Sunshine implements Weather {
    @Override
    public String getWeather() {
        return "com.Sunshine";
    }

    @Override
    public void doAction(Context context) {
        context.setWeather(this);
    }
}