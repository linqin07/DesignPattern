/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/21
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
