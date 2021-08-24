package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/06
 */
public abstract class Employer {
    public List<Employer> employers;
    private String name;

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public Employer() {
        System.out.println("初始化Employer ");
        employers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
