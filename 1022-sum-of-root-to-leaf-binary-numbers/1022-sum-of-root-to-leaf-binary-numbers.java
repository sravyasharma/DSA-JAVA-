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
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int totalSum = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // If it's a leaf node
            if (node.left == null && node.right == null) {
                totalSum += node.val;
            }

            if (node.left != null) {
                node.left.val = node.val * 2 + node.left.val;
                queue.add(node.left);
            }

            if (node.right != null) {
                node.right.val = node.val * 2 + node.right.val;
                queue.add(node.right);
            }
        }

        return totalSum;
    }
}