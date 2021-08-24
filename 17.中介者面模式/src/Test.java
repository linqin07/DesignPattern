/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.notice("boss");
        concreteMediator.notice("client");
    }
}
