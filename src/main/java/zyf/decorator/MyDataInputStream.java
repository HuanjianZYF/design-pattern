package zyf.decorator;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 下午8:56
 */
public class MyDataInputStream extends InputStreamDecorator {

    public MyDataInputStream(MyInputStream myInputStream) {
        super(myInputStream);
    }

    @Override public char read() { //当传入的MyInputStream是别的decorator的实现类时，会保留上一层装饰所做的修改，再对现在这层装饰做增强
        doOther();
        return super.read();
    }

    private void doOther() {
        System.out.println("do other");
    }
}
