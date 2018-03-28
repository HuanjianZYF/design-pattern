package zyf.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/28 下午11:07
 * 树枝节点，有一个字段是所有的孩子
 */
public class BranchNode extends Node {

    private List<Node> children = new ArrayList<Node>();

    public BranchNode(String value) {
        super(value);
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node node) {
        children.add(node);
    }

    public void removeChild(Node node) {
        children.remove(node);
    }

}
