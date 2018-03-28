package zyf.observe;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 上午12:07
 * 被监视实现
 */
public class ObservableImpl extends Observable {

    public void f() { //这个方法被监视
        System.out.println("haha");
        notifyObserver();
    }
}
