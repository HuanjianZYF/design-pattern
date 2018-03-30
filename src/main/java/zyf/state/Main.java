package zyf.state;

/**
 * @Author zyf
 * @CreateAt 2018/3/31 上午12:52
 * 状态模式  这个是java里面状态机的实现 当然这个没能抽象到可以传状态可以执行的动作，动作执行后的状态来自动生成状态机
 * 关键在于在上下文中保存一个状态，上下文中执行的方法相当于让这个状态来进行这个方法
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.OPEN);
        context.close();
        context.open();
        context.run();
        context.close();
        context.run();
        context.stop();
        context.open();
    }
}
