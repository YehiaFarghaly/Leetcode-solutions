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
       List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        boolean f = false;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
               for(int i=0;i<n;i++){
                    TreeNode cur = q.poll();
                    list.add(cur.val);
                    if(cur.left!=null) q.add(cur.left);
                    if(cur.right!=null) q.add(cur.right);
               }
               if(f){
                   Collections.reverse(list);
               }
               f=!f;
               ans.add(list);
        }
        return ans;
    } 
    }
   
