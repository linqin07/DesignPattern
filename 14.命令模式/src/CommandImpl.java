/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/16
 */
public class CommandImpl extends Command {
    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
