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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = getInOrderList(new ArrayList<Integer>(), root);
        return inOrder;
    }
    public List<Integer> getInOrderList(List<Integer> inOrder, TreeNode node){
        if(node!=null){
             getInOrderList(inOrder,node.left);
             inOrder.add(node.val);
             getInOrderList(inOrder,node.right); 
        }
             return inOrder;
        
    }
}
