/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public class SimpleExpression extends Expression {
    @Override
    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}
