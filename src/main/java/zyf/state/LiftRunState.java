package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:30
 */
public class LiftRunState extends LiftState {

    public void stop() {
        this.context.setLiftState(Context.STOP);
        this.context.stop();
    }

    public void close() {

    }

    public void run() {
        System.out.println("run");
    }

    public void open() {

    }
}
