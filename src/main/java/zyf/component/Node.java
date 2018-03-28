package zyf.component;

/**
 * @Author zyf
 * @CreateAt 2018/3/28 下午11:03
 * 树中节点的基本的属性和方法
 */
public abstract class Node {

    private String value; //节点的属性

    public Node(String value) {
        this.value = value;
    }

    public void myMethod() {
        System.out.println("ok");
    }
}
