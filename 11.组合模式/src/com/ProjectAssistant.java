package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/06
 */
public class ProjectAssistant extends Employer {

    public ProjectAssistant(String name) {
        setName(name);
        employers = null;
    }

    @Override
    public void add(Employer employer) {}

    @Override
    public void delete(Employer employer) {}
}
