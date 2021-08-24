/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/16
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
