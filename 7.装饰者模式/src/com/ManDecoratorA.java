package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public class ManDecoratorA extends Decorator {
    public ManDecoratorA(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        System.out.println("ManDecoratorA");
        super.eat();
    }
}
