package zyf.adapter;

/**
 * @Author zyf
 * @CreateAt 2018/3/27 下午10:35
 * 适配器 自己是目标类的子类 把被适配的东西传入 作为成员变量
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void targetMethod() {
        //用成员变量做文章
    }
}
