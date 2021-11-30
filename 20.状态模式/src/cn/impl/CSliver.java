package cn.impl;

import cn.CState;
import cn.FlyContext;

public class CSliver extends CState {
    @Override
    public double travel(double miles, FlyContext flyContext) {
        if (flyContext.getFlyMiles() <= 25000) {
            flyContext.setcState(new CBasic());
        }

        if (flyContext.getFlyMiles() > 50000) {
            flyContext.setcState(new CGlod());

        }

        System.out.println("升级白银会员");
        return miles + miles * 0.25;
    }
}
