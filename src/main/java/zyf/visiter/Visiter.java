package zyf.visiter;

/**
 * @Author zyf
 * @CreateAt 2018/3/30 下午11:41
 * 访问者模式 是在遍历的时候 根据实际对象的不同 用不同的策略 其实就是策略模式
 */
public class Visiter implements IVisiter {

    public void visit(Benz benz) {
        System.out.println("I am benz");
    }

    public void visit(BMW bmw) {
        System.out.println("I am bmw");
    }
}
