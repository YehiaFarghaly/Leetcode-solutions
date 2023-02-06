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
    public ListNode middleNode(ListNode head) {
        int size = getSize(head);
        int ctr=1;
        while(head.next!=null){
            if(ctr==(size/2)+1) return head;
          head=head.next;
          ctr++;
        }
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
