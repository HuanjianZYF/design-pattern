package zyf.memento;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 下午11:11
 * 能建备忘录，能读备忘录就好了
 */
public class Reality {

    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void resetMemento(Memento memento) {
        this.state = memento.getState();
    }
}
