package com.old;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/13
 */
public class Test {
    public static void main(String[] args) {
        //出差花费8000元
        int amount = 80000;
        // 先找员工张飞审批
        Staff staff = new Staff("张三");
        if (!staff.approve(amount)) {
            //被拒，找李四经理问问。
            Manager manager = new Manager("李四");
            if (!manager.approve(amount)) {
                //还是被拒，只能找老大了。
                CEO ceo = new CEO("ceo");
                ceo.approve(amount);
            }
        }
        /***********************
         无权审批，请找上级。【员工：张三】
         无权审批，请找上级。【经理：李四】
         驳回申请。【CEO：ceo】
         ***********************/
    }
}
