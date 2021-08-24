package com.news;

/**
 * @Description: 抽象类审批人
 * @author: LinQin
 * @date: 2019/02/13
 */
public abstract class Approver {
    protected String name;// 抽象出审批人的姓名。
    protected Approver nextApprover;// 下一个审批人，更高级别领导

    public Approver(String name) {
        this.name = name;
    }

    // 设置下一级审批人同时返回下一个审批人对象。
    public Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover;
    }

    // 抽象审批方法由具体审批人子类实现
    public abstract void approve(int amount);
}
