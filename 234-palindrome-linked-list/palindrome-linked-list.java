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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the midpoint of the linked list
        ListNode mid = findMid(head);

        // Reverse the second half of the linked list
        ListNode rhead = reverse(mid);

        // Check if the list is a palindrome
        ListNode fhead = head;
        while (rhead != null) {
            if (fhead.val != rhead.val) {
                return false;
            }
            fhead = fhead.next;
            rhead = rhead.next;
        }

        return true;
    }

    // Function to find the middle of the linked list
    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to reverse the linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
