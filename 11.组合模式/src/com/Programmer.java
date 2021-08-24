package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/06
 */
public class Programmer extends Employer {

    public Programmer(String name) {
        super.setName(name);
        employers = null;
    }
    @Override
    public void add(Employer employer) {}
    @Override
    public void delete(Employer employer) {}
}
