import java.util.ArrayList;
import java.util.List;

// 589. N叉树的前序遍历
public class N_ary_tree_preorder_traversal {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        inOrder(root);
        return list;
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            inOrder(root.children.get(i));
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
