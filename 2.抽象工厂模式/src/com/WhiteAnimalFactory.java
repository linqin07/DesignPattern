package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/03
 */
public class WhiteAnimalFactory implements AbstractFactory {

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }

    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

}
