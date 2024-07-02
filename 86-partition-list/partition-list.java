/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
You are given a linked list and a target number x. You have to reorder the list in such a way that any node with a value strictly less than x appears in the beginning of the list, such that their relative order among themselves is preserved.

For example: [1,4,3,2,5,2] and x=3. All the numbers strictly smaller than x are [1,2,2]. So preserve only their relative order and add them in the beginning of the list.

After that you have to preserve the relative order of all the remaining elements as well, and after that you can return the list head.

For example, let us consider the above example only, in [1,4,3,2,5,2] and x=3, after removing all the numbers strictly less than x, the remaining list is [4,3,5]. So their relative order is preserved accordingly.

In the end just concatenate the two and return the result.

So if the problem statement is clear, then one can appreciate the importance of two pointers approach

 */
class Solution {
    public ListNode partition(ListNode head, int x) {
   ListNode smallerNode = new ListNode(-1);
        ListNode smaller = smallerNode;
        

        ListNode greaternode = new ListNode(-1);
        ListNode greater= greaternode;

        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                smaller.next = curr;
                smaller =smaller.next;
            } 
            else {
                greater.next = curr;
                greater =greater.next;
            }
            curr=curr.next;
        }


      smaller.next = greaternode.next;
      greater.next = null;
      return smallerNode.next;

    }
}