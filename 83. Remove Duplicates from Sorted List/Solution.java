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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
             if(prev!=null){
                 if(prev.val==current.val) {
                     while(current!=null && prev.val==current.val){
                         current=current.next;
                     }
                     prev.next = current;
                 }
             }
             prev = current;
             if(current!=null)
             current = current.next;
        }
        return head;
    }
}
