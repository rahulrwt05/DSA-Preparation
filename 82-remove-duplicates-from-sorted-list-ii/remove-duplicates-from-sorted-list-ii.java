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
      // Create a dummy node to handle edge cases more easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preSlow = dummy;  // Pointer to track the node before the current node
        ListNode slow = head;      // Pointer to track the current node
        ListNode fast = (head != null) ? head.next : null; // Pointer to track the next node

        while (slow != null) {
            boolean isDuplicate = false;
            // Check for duplicates
            while (fast != null && slow.val == fast.val) {
                isDuplicate = true;
                fast = fast.next;
            }
            // If duplicates were found, skip all of them
            if (isDuplicate) {
                preSlow.next = fast;
            } else {
                // Otherwise, move the preSlow pointer
                preSlow = slow;
            }
            // Move the slow pointer to the next node to continue the process
            slow = fast;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return dummy.next;}  
    
}