package zyf.command;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午6:21
 */
public class Receiver1Do1Command extends Command {

    public Receiver1Do1Command() {
        this.setReceiver(new Receiver1());
    }

    public void execute() {
        ((Receiver1)this.getReceiver()).do1();
    }
}
