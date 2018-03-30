package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:22
 * 电梯的上下文 有当前的状态，有电梯的动作，但是动作都是调用那个具体状态的动作
 */
public class Context {

    public final static LiftStopState STOP = new LiftStopState();
    public final static LiftCloseState CLOSE = new LiftCloseState();
    public final static LiftOpenState OPEN = new LiftOpenState();
    public final static LiftRunState RUN = new LiftRunState();


    private LiftState liftState; //当前电梯状态

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void stop() {
        this.liftState.stop();
    }

    public void run() {
        this.liftState.run();
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }
}
