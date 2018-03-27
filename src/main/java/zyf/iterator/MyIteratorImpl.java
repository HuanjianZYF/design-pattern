package zyf.iterator;

import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/27 下午10:53
 * 迭代器 方便遍历就好
 */
public class MyIteratorImpl<E> implements MyIterator<E> {

    private List<E> list;

    private int currencyIndex;

    public MyIteratorImpl(List<E> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return currencyIndex < list.size();
    }

    public E next() {
        return list.get(currencyIndex++);
    }
}
