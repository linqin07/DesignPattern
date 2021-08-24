/**
 * @Description: 访问者实现类
 * @author: LinQin
 * @date: 2021/07/21
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(ComputerPart computerPart) {
        // computerPart.accept(this);
        System.out.println(computerPart.getClass().getName());
    }
}
