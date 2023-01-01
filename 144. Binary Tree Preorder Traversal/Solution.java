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
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> preOrder = getPreOrderList(new ArrayList<Integer>(), root);
        return preOrder;
    }
    public List<Integer> getPreOrderList(List<Integer> inOrder, TreeNode node){
        if(node!=null){
             inOrder.add(node.val);
             getPreOrderList(inOrder,node.left);
             getPreOrderList(inOrder,node.right); 
        }
             return inOrder;
        
    }
}
