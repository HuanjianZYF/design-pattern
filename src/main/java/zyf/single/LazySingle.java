package zyf.single;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午9:23
 * 懒汉式单例，不需要初始化就在内存
 */
public class LazySingle {
    private static LazySingle instance = null;

    private LazySingle(){
    }

    public synchronized LazySingle getInstance() {
        if (instance == null) {
            instance = new LazySingle();
        }

        return instance;
    }
}
