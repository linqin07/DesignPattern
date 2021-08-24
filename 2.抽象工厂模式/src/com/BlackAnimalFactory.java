package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/03
 */
public class BlackAnimalFactory implements AbstractFactory {

    @Override
    public IDog createDog() {
        return new BlackDog();
    }

    @Override
    public ICat createCat() {
        return new BlackCat();
    }
}
