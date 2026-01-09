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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return null;
        Map<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        map.put(root,null);
        List<TreeNode> lev=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            lev.clear();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                lev.add(node);

                if(node.left!=null){
                    map.put(node.left,node);
                    q.add(node.left);
                }
                if(node.right!=null){
                    map.put(node.right,node);
                    q.add(node.right);
                }
            }
        }
        Set<TreeNode> set=new HashSet<>(lev);
        while(set.size()>1){
            Set<TreeNode> newe=new HashSet<>();
            for(TreeNode nod:set){
                newe.add(map.get(nod));
            }
            set=newe;
        }
        return set.iterator().next();
    }
}