package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:29
 */
public class LiftCloseState extends LiftState {

    public void stop() {
        this.context.setLiftState(Context.STOP);
        this.context.stop();    }

    public void close() {
        System.out.println("close");
    }

    public void run() {
        this.context.setLiftState(Context.RUN);
        this.context.run();
    }

    public void open() {
        this.context.setLiftState(Context.OPEN);
        this.context.open();
    }
}
