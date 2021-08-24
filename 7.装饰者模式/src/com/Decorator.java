package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public abstract class Decorator implements Person {
    protected Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
