import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

// 94. 二叉树的中序遍历
public class Binary_tree_norder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(res, root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        //按照 左-打印-右的方式遍历
        dfs(res, root.left);
        res.add(root.val);
        dfs(res, root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
