package zyf.proxy.staticproxy;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午10:00
 * 代理类，将真正的
 */
public class WorkProxy implements IWork {

    private IWork work = null;

    public WorkProxy(IWork work) {
        this.work = work;
    }

    public void doSomeThing() {
        this.work.doSomeThing();
    }
}
