package zyf.strategy;

/**
 * @Author zyf
 * @CreateAt 2018/3/27 下午10:12
 * 策略模式 仅仅是成员变量的多态
 */
public class Executer {
    private IStrategy strategy;

    public Executer(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void exec() {
        strategy.doSomeThing();
    }
}
