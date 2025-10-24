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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> sumq=new LinkedList<>();
        if(root==null) return false;
        q.offer(root);
        sumq.offer(root.val);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int sum=sumq.poll();
            if(node.left==null && node.right==null){
                if(sum==targetSum){
                    return true;
                }
            } 
            if(node.left!=null) {
                q.offer(node.left); 
                sumq.offer(sum + node.left.val);
            }    
            if(node.right!=null) {
                q.offer(node.right); 
                sumq.offer(sum + node.right.val);
            }    
        }
        return false;
    }
}