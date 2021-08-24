package cn;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/06
 */
public class AdapterImpl implements Adapter {
    private Adaptee adaptee;

    public AdapterImpl(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("适配器类的方法");
    }
}
