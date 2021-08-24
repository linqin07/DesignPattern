/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public class Test {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());

        for (Expression expression : ctx.getList()) {
            expression.interpret(ctx);
        }
    }
}
