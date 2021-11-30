package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/20
 */
public class Context {
    private Weather weather;

    public String weatherMessage() {
        return weather.getWeather();
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
