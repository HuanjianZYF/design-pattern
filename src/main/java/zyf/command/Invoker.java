package zyf.command;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午6:24
 * 命令模式就是定义很多的命令类，命令类组合各个Receiver来完成命令，客户端只和Invoker交互
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
