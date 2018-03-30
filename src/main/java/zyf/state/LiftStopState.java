package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:30
 */
public class LiftStopState extends LiftState {

    public void stop() {
        System.out.println("stop");
    }

    public void close() {
        this.context.setLiftState(Context.CLOSE);
        this.context.close();
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
