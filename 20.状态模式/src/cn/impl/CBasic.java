package cn.impl;

import cn.CState;
import cn.FlyContext;

public class CBasic extends CState {
    @Override
    public double travel(double miles, FlyContext flyContext) {
        if (flyContext.getFlyMiles() >= 25000 && flyContext.getFlyMiles() < 50000) {
            flyContext.setcState(new CSliver());
        }

        if (flyContext.getFlyMiles() >= 50000) {
            flyContext.setcState(new CGlod());
        }
        System.out.println("基础会员不计算里程数！");
        return miles;
    }
}
