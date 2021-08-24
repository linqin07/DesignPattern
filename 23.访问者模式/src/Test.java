/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/21
 */
public class Test {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        System.out.println("--------------");
        Mouse mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());
    }
}
