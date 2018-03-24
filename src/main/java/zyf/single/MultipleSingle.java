package zyf.single;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 上午9:26
 * 多实例的单例
 */
public class MultipleSingle {

    private static final int INSTANCE_NUM = 10; //实例个数
    private static List<MultipleSingle> instanceList = new ArrayList<MultipleSingle>(10); //实例列表

    private MultipleSingle() {
    }

    static {
        for (int i = 0; i < INSTANCE_NUM; i++) {
            instanceList.add(new MultipleSingle());
        }
    }

    public MultipleSingle getInstance(int index) {
        return instanceList.get(index);
    }
}
