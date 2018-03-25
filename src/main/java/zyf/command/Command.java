package zyf.command;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午6:20
 */
public abstract class Command {

    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public abstract void execute();
}
