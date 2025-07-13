import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class LargestSumBinaryTree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        long current_level_sum = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.remove();
                current_level_sum += root.val;
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }
            res.add(current_level_sum);
            current_level_sum = 0;
        }
        Collections.sort(res);
        return k > res.size() ? -1 : res.get(res.size() - k);
    }
}