package zyf.template;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午2:40
 * 模板模式，在抽象父类中完成一个流程 在子类中具体重写流程中的步骤
 * 扩展性很强
 */
public abstract class AbstrateProcedure {

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();

    public final void execute() {
        step1();
        step2();
        step3();
    }
}
