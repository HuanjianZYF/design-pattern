package zyf.observe;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 上午12:09
 */
public class ObserverImpl1 implements Observer {

    public void update() {
        System.out.println("I see you");
    }
}
