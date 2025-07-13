/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MaxLevelSumBinaryTree {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = root.val;
        int level= 1;
        int left = 0, right = 0;
        int max_per_level = 0;
        int current_level = 1;
        
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0 ; i <size; i++) {
                root = q.poll();
                max_per_level += root.val;
                if (root.left != null) q.add(root.left);
                if (root.right != null) q.add(root.right);
            }
            if (max < max_per_level) {level = current_level; max = max_per_level;}
            max_per_level = 0;
            current_level++;
        }
        return level;
    }
}