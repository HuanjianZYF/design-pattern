package zyf.visiter;

/**
 * @Author zyf
 * @CreateAt 2018/3/30 下午11:39
 */
public class BMW extends Car {

    public void accept(IVisiter visiter) {
        visiter.visit(this);
    }
}
