package zyf.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/25 上午10:27
 * 原型模式就是拷贝出来之后再改，java 默认clone是在堆里复制内存块，
 * 对于对象中的列表是浅拷贝，因此重写clone方法时要注意用深拷贝
 */
public class ProtoTypeClass implements Cloneable {

    private ArrayList<String> list;
    private String name;

    @Override protected Object clone() throws CloneNotSupportedException {

        ProtoTypeClass result = (ProtoTypeClass) super.clone();
        result.setList((ArrayList<String>) this.list.clone());
        return result;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
