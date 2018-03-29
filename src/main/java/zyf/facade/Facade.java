package zyf.facade;

/**
 * @Author zyf
 * @CreateAt 2018/3/29 下午10:24
 * 门面模式 外面所有的请求都与门面交互 这样对客户端很友好
 */
public class Facade {
    private Inner1 inner1;
    private Inner2 inner2;

    public void method1() {
        this.inner1.method1();
    }

    public void method2() {
        this.inner2.method2();
    }
}
