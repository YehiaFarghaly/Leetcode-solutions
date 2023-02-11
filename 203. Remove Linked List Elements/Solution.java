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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = new ListNode(0);
        while(current!=null && current.val == val){
            head = current.next;
            current=head;
        }
        while(current!=null){
            if(current.val!=val) {
            prev.next = current;
            prev = prev.next;
            }
            current = current.next;
        }
        prev.next =null;
        return head;
    }
}
