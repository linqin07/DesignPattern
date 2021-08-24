/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/16
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
