/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Calculate the lengths of both linked lists
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        // Align both pointers to the same starting point from the end
        if (lengthA > lengthB) {
            headA = moveForward(headA, lengthA - lengthB);
        } else {
            headB = moveForward(headB, lengthB - lengthA);
        }

        // Move both pointers until they intersect
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection found
    }

    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    private ListNode moveForward(ListNode node, int steps) {
        while (steps > 0 && node != null) {
            node = node.next;
            steps--;
        }
        return node;
    }
}
