/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
public ListNode detectCycle(ListNode head) {
if(head==null || head.next==null)
return null;

    ListNode ini = head;
    ListNode fast = head; 

    while(fast!=null && fast.next!=null){
        head=head.next;
        fast=fast.next.next;
        if(head == fast){
            while (fast != ini) {
                fast = fast.next;
                ini = ini.next;
            }
            return ini;
        }
    }
    return null;
}
}
