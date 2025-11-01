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
    long min;
    public boolean isValidBST(TreeNode root) {
        min=Long.MIN_VALUE;
        return inorder(root);
    }
    public boolean inorder(TreeNode root){
        if(root==null) return true;
        if(!inorder(root.left)) return false;
        if(min>=root.val) return false;
        min=root.val;
        if(!inorder(root.right)) return false;
        return true;
    }
}