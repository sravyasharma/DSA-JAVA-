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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return null;
        q.offer(root);
        boolean odd=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<TreeNode> lev=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                lev.add(node);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(odd){
                int left=0;
                int right=lev.size()-1;
                while(left<right){
                    int temp=lev.get(left).val;
                    lev.get(left).val=lev.get(right).val;
                    lev.get(right).val=temp;
                    left++;
                    right--;
                }
            }
            odd=!odd;
        }
        return root;
    }
}