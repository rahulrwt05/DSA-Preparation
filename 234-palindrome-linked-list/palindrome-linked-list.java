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
        if (head == null || head.next == null)
        {
        return true;
    }
        ListNode fhead =head;
        ListNode mid =mid(head);
        ListNode rhead =reverse(mid);
        ListNode reversehead=rhead;
         while(rhead!=null){
            if(fhead.val!=rhead.val){
              break;
            }fhead=fhead.next;
            rhead=rhead.next;
         } 
         return fhead==null || rhead==null;
    }
    static ListNode mid(ListNode head){
        ListNode slow =head;
        ListNode fast =head;
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
    }
    static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
    
     while(current!=null){   ListNode next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    } return prev;}
}