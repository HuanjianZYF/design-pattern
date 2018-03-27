package zyf.iterator;

import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/27 下午10:52
 */
public interface Container {
    void add(Long a);
    MyIterator iterator(List list);
}
