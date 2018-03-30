package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:21
 * 抽象的电梯状态，关联了context，并放了电梯的所有动作
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void stop();
    public abstract void close();
    public abstract void run();
    public abstract void open();
}
