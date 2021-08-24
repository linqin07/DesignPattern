/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public class Facade {
    ServiceA a;
    ServiceB b;

    public Facade() {
        a = new ServiceA();
        b = new ServiceB();
    }

    public void methodA() {
        a.methodA();
        System.out.println("a顺便打下酱油");
    }

    public void methodB() {
        b.methodB();
        System.out.println("b顺便打下酱油");
    }
}
