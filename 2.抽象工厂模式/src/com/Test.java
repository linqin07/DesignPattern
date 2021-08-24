package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/03
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat cat = blackAnimalFactory.createCat();
        cat.eat();
        IDog dog = blackAnimalFactory.createDog();
        dog.eat();


        AbstractFactory whiteAnimalFactory = new WhiteAnimalFactory();
        IDog whitedog = whiteAnimalFactory.createDog();
        whitedog.eat();
        ICat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();

    }
}
