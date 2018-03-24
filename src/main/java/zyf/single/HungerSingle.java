package zyf.single;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午9:20
 * 饿汉式单例模式
 */
public class HungerSingle {

    private static final HungerSingle instance = new HungerSingle();

    private HungerSingle() {
    }

    public HungerSingle getInstance() {
        return instance;
    }
}
