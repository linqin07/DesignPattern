package cn.impl;

import cn.CState;
import cn.FlyContext;

public class CGlod extends CState {
    @Override
    public double travel(double miles, FlyContext flyContext) {
        if (flyContext.getFlyMiles() > 25000 && flyContext.getFlyMiles() < 50000) {
            flyContext.setcState(new CSliver());
        }

        if (flyContext.getFlyMiles() < 25000) {
            flyContext.setcState(new CBasic());
        }

        System.out.println("黄金会员");
        return miles + miles * 0.5;
    }
}
