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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getAllValues(root,arr);
        arr.sort(null);
        int ans = (int)1e9;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i+1)-arr.get(i)<ans) ans = arr.get(i+1)-arr.get(i);
        }
        return ans;
    }
    public void getAllValues(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        getAllValues(root.left,arr);
        getAllValues(root.right,arr);
    }
}
