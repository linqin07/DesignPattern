/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/12
 */
public class Test {
    public static void main(String[] args) {
        Flyweight fly1 = FlyweightFactory.getFlyweight("a");
        fly1.action(1);
        fly1.action(2);
        fly1.action(3);

        Flyweight fly2 = FlyweightFactory.getFlyweight("b");
        fly2.action(1);
        fly2.action(2);
        fly2.action(3);
    }
}
