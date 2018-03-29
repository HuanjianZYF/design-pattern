package zyf.memento;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 下午11:16
 * 类自身具有备忘功能
 */
public class MementoSelf implements Cloneable {

    private MementoSelf self;

    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void createMemento() {
        try {
            this.self = (MementoSelf) this.clone();
        } catch (Exception e) {
        }
    }

    public void resetMemento() {
        this.state = self.getState();
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
