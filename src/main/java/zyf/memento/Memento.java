package zyf.memento;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 下午11:12
 */
public class Memento {

    private Object state;

    public Memento(Object state) {
        this.state = state;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }
}
