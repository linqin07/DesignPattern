package cn;

public abstract class CState {
    /**
     * 飞距离
     */
    public double flyMiles;
    public abstract double travel(double miles, FlyContext flyContext);

}
