package zyf.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/27 下午10:58
 */
public class ContainerImpl implements Container {

    private List<Long> list = new ArrayList<Long>();

    public void add(Long a) {
        list.add(a);
    }

    public MyIterator iterator(List list) {
        return new MyIteratorImpl(list);
    }
}
