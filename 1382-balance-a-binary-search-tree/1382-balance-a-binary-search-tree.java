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
    List<TreeNode> arr = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0, arr.size() - 1);
    }

    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
    }

    TreeNode build(int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        TreeNode root = arr.get(m);
        root.left = build(l, m - 1);
        root.right = build(m + 1, r);
        return root;
    }
}
