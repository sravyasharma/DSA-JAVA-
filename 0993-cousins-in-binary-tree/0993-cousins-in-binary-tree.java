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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> que=new LinkedList<>();
        Queue<Integer> Pque=new LinkedList<>();
        que.add(root);
        Pque.add(-1);
        while(!que.isEmpty()){
            int size=que.size();
            boolean foundX=false; boolean foundY=false;
            int parentX=-1; int parentY=-1;
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                int parent=Pque.poll();
                if(node.val==x){
                    foundX=true;
                    parentX=parent;
                }
                if(node.val==y){
                    foundY=true;
                    parentY=parent;
                }
                if(node.left!=null){
                    que.add(node.left);
                    Pque.add(node.val);
                }
                if(node.right!=null){
                    que.add(node.right);
                    Pque.add(node.val);
                }
            }
            if(foundX ^ foundY) return false;
            if(foundX && foundY) return parentX!=parentY;
        }
        return false;
    }
}