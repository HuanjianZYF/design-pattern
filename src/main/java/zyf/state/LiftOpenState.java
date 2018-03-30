package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:27
 * 电梯 开启状态
 */
public class LiftOpenState extends LiftState {

    public void stop() {
    }

    public void close() {
        this.context.setLiftState(Context.CLOSE);
        this.context.close();
    }

    public void run() {
    }

    public void open() {
        System.out.println("open");
    }
}
