package com;

/**
 * @Description: 简单工厂模式
 * @author: LinQin
 * @date: 2018/12/05
 */
public class Factory {

    public AlertRuleInterface get(int config) {
        if (1 == config) {
            return new Config1();
        } else if (2 == config) {
            return new Config2();
        }
        return null;
    }
}
