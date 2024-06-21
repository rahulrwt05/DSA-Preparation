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
    public void reorderList(ListNode head) {
        ListNode mid=findmid(head);
        ListNode rhead=reverse(mid);
ListNode temp=head;
        while(temp!=null && rhead!=null){
            ListNode n1=temp.next;
            ListNode n2=rhead.next;
            temp.next=rhead;
            rhead.next=n1;
             temp=n1;
            rhead=n2;
           
        }
    }static ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null && fast.next.next != null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }return prev;
    }
}