package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public class ManDecoratorB extends Decorator {
    @Override
    public void eat() {
        System.out.println("ManDecoratorB");
        super.eat();
    }

    public ManDecoratorB(Person person) {
        super(person);
    }
}
