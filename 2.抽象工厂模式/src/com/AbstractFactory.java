package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/03
 */
public interface AbstractFactory {
    IDog createDog();

    ICat createCat();
}
