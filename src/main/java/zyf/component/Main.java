package zyf.component;

import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/28 下午11:11
 * 所谓组合模式，其实就是java里面怎么来表示树
 */
public class Main {

    public static void main(String[] args) {

    }

    private void travelRoot(Node node) { //遍历节点
        node.myMethod();
        if (node instanceof BranchNode) {
            List<Node> nodeList = ((BranchNode) node).getChildren();
            if (nodeList != null && nodeList.size() != 0) {
                for (Node each : nodeList) {
                    travelRoot(node);
                }
            }
        }
    }
}
