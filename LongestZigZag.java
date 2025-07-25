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
class LongestZigZag {
    public int longestZigZag(TreeNode root) {
        int max = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return 0;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode r = q.poll();
                int a = move(r);
                if (max < a)
                    max = a;
                if (r.left != null)
                    q.add(r.left);
                if (r.right != null)
                    q.add(r.right);
            }
        }
        return max;
    }

    public int move(TreeNode node) {
        boolean left = false, right = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int current_max = 0;

        if (node.left != null) {
            left = true;
            TreeNode r = node.left;
            while (r != null) {
                current_max++;
                if (left) {
                    r = r.right;
                    right = true;
                    left = false;
                } else {
                    r = r.left;
                    right = false;
                    left = true;
                }
            }
        }
        int max = current_max;
        current_max = 0;
        left = false;
        if (node.right != null) {
            right = true;
            TreeNode r = node.right;
            while (r != null) {
                current_max++;
                if (left) {
                    r = r.right;
                    right = true;
                    left = false;
                } else {
                    r = r.left;
                    right = false;
                    left = true;
                }
            }
        }
        return Math.max(max, current_max);
    }
}