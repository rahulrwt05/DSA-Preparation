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
       ListNode fastp = head;
        ListNode slowp = head;
         // Move the fastp pointer N nodes ahead
        for (int i = 0; i < n; i++)
            fastp = fastp.next;
if (fastp == null){
            return head.next;}
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // Delete the Nth node from the end
      
    
        slowp.next = slowp.next.next;
  
        return head;
}
    }
 