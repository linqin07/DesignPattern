package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/06
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name) {
        setName(name);
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
