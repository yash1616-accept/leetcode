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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if(root==null) return ans ;
    Queue<TreeNode> q = new LinkedList<>();
     q.offer(root);
     q.offer(null);//entry level merker 
    List<Integer> list = new ArrayList<>();
      while(!q.isEmpty()){
        TreeNode currnode= q.remove();
        if(currnode==null){
           ans.add(list);
            if(!q.isEmpty()){
                list = new ArrayList<>();
                q.offer(null);
            }
        }else{
       list.add(currnode.val);
       if(currnode.left!=null)q.offer(currnode.left);
       if(currnode.right!=null)q.offer(currnode.right);
        }
      }
      return ans ;
     
    }
}