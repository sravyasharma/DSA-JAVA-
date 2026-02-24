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
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
                TreeNode node=q.poll();
                if(node.left==null && node.right==null) sum+=node.val;


                if(node.left!=null){
                    node.left.val=node.val*2+node.left.val;
                    q.add(node.left);
                }
                if(node.right!=null){
                    node.right.val=node.val*2+node.right.val;
                    q.add(node.right);
                }
            }
        return sum;
    }
}