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
    long total=0,max=0;
    public int maxProduct(TreeNode root) {
        total=TotalSum(root);
        dfs(root);
        return (int)(max%1000000007);
    }
    long TotalSum(TreeNode n){
        if(n==null) return 0;
        return n.val + TotalSum(n.left) + TotalSum(n.right);
    }
    long dfs(TreeNode n){
        if(n==null) return 0;
        long s=n.val + dfs(n.left) + dfs(n.right);
        max=Math.max(max,s*(total-s));
        return s;
    }
}