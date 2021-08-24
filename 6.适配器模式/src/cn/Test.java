package cn;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/06
 */
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl(new Adaptee());
        adapter.adapteeMethod();
        adapter.adapterMethod();
    }
}
