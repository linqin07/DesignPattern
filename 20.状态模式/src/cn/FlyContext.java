package cn;

import cn.impl.CBasic;

public class FlyContext {
    CState cState;
    double flyMiles;

    public FlyContext() {
        cState = new CBasic();
        flyMiles = 0;
        // setcState(cState);
    }

    public void travel(int miles) {
        // flyMiles += miles;
        double travel = cState.travel(miles, this);
        this.flyMiles += travel;
        System.out.println("总航行：" + flyMiles + " km");
        System.out.println();
    }





    public CState getcState() {
        return cState;
    }

    public void setcState(CState cState) {
        this.cState = cState;
    }

    public double getFlyMiles() {
        return flyMiles;
    }

    public void setFlyMiles(double flyMiles) {
        this.flyMiles = flyMiles;
    }
}
