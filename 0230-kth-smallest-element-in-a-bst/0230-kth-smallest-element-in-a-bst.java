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
    int kele=0;
    int i=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        inorder(root,k);
        return kele;
    }
    public void inorder(TreeNode root,int k){
        if(root==null) return ;
        inorder(root.left,k);
        i++;
        if(i==k) kele=root.val;
        inorder(root.right,k);
    }
}