package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/03/26
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        Decorator decorator = new ManDecoratorA(new ManDecoratorB(man));
        decorator.eat();
    }
}
