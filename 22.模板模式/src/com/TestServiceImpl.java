package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2018/12/05
 */
public class TestServiceImpl {
    public static void main(String[] args) {
        // 实际由spring注入
        // Factory factory = new Factory();
        // AlertRuleInterface alertRuleInterface = factory.get(2);
        // String s = alertRuleInterface.create();
        // System.out.println(s);

        Config1 config1 = new Config1();
        System.err.println(config1.create());

        Config2 config2 = new Config2();
        System.err.println(config2.create());
    }
}
