/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/16
 */
public class Test {
    public static void main(String[] args) {
        // 接收者
        Receiver receiver = new Receiver();
        // 将请求封装为一个对像，这里可以同时实现很多其他的命令
        CommandImpl command = new CommandImpl(receiver);
        // 执行者
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
}
