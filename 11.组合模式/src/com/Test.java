package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/06
 */
public class Test {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("项目经理");
        ProjectAssistant pa = new ProjectAssistant("项目助理");
        Programmer no1 = new Programmer("程序员1号");
        Programmer no2 = new Programmer("程序员2号");

        pm.add(pa);
        pm.add(no1);
        pm.add(no2);

        for (Employer employer : pm.employers) {
            System.out.println(employer.getName());
        }
    }
}
