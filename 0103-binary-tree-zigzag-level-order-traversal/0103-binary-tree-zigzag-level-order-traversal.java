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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> q=new LinkedList<>();
        q.offerFirst(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=leftToRight?q.pollFirst():q.pollLast();
                level.add(node.val);
                if(leftToRight){
                    if(node.left!=null) q.offerLast(node.left);
                    if(node.right!=null) q.offerLast(node.right);
                }
                else{
                    if(node.right!=null) q.offerFirst(node.right);
                    if(node.left!=null) q.offerFirst(node.left);
                }
            }
            res.add(level);
            leftToRight= !leftToRight;
        }
        return res;
    }
}