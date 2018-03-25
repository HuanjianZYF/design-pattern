package zyf.decorator;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午8:54
 * 装饰器模式是把上一层的装饰类对象作为成员变量，先执行上一层的方法，再继续增强这一层
 */
public abstract class InputStreamDecorator implements MyInputStream {

    private MyInputStream myInputStream;

    public InputStreamDecorator(MyInputStream myInputStream) {
        this.myInputStream = myInputStream;
    }

    public char read() {
        return myInputStream.read();
    }

}
