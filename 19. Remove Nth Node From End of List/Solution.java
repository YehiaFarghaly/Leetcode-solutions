/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int size = getSize(head);
       if(current.next==null && n==1) return null;
        if(n==size) return head.next;
        int cnt = size-n-1;
        while(cnt-->0) current = current.next;
        current.next = current.next.next;
        return head;
    }
      public int getSize(ListNode l){
        int ctr=1;
        while(l.next!=null){
           ctr++;
           l=l.next;
        }
        return ctr;
    }
}
