/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/12
 */
public class FlyweightImpl implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值: " + arg);
    }
}
