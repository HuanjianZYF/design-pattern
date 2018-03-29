package zyf.memento;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 下午11:14
 */
public class MementoManager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
