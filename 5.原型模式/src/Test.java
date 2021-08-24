/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/03
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype(" sb");
        Prototype clone = (Prototype)prototype.clone();
        System.out.println(prototype.toString() + prototype.getName());
        System.out.println(clone.toString() + clone.getName());
    }
}
