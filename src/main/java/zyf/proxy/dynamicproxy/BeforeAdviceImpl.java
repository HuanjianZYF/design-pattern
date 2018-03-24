package zyf.proxy.dynamicproxy;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午10:36
 */
public class BeforeAdviceImpl implements BeforeAdvice {

    public void before() {
        System.out.println("before..");
    }
}
