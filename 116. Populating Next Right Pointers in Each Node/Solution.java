/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node root) {
         Queue<Node> q = new LinkedList<>();
        if(root==null) return root;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
               for(int i=0;i<n;i++){
                    Node cur = q.poll();
                   if(i<n-1)
                    cur.next = q.peek();
                    if(cur.left!=null) q.add(cur.left);
                    if(cur.right!=null) q.add(cur.right);
               }
        }
        return root;
    }
}
