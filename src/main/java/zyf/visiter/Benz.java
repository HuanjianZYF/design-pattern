package zyf.visiter;

/**
 * @Author zyf
 * @CreateAt 2018/3/30 下午11:36
 */
public class Benz extends Car {

    public void accept(IVisiter visiter) {
        visiter.visit(this);
    }
}
