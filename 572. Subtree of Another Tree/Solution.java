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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if(root==null) return false;
        return isEqual(root,subRoot) ||
        isSubtree(root.left,subRoot) ||
        isSubtree(root.right,subRoot);
    }
    public boolean isEqual(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return root1.val==root2.val && 
        isEqual(root1.right,root2.right) &&
        isEqual(root1.left,root2.left);
    }
}
