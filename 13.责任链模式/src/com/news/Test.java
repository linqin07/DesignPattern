package com.news;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/13
 */
public class Test {
    public static void main(String[] args) {
        Approver approver = new Staff("张三");
        approver.setNextApprover(new Manager("李四"))
                .setNextApprover(new CEO("王五"));
        approver.approve(8000);

        // 无权审批，升级处理。【员工：张三】
        // 无权审批，升级处理。【经理：李四】
        // 审批通过。【CEO：王五】

    }
}
