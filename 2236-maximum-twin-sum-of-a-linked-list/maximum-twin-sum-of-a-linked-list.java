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
    public int pairSum(ListNode head) {if (head == null) {
            return 0;
        }
        if (head.next == null) {
            return head.val;
        }
    ListNode h1=head;
        ListNode mid=findmid(head);
        ListNode rev=reverse(mid);
    ListNode h2=rev; int maxSum=0;
    while( h2!=null){
int sum = h1.val + h2.val;
            maxSum = Math.max(maxSum, sum);
            h1 = h1.next;
            h2 = h2.next;



    }
   return maxSum; }static ListNode findmid(ListNode head){
   ListNode slow=head;
    ListNode fast=head;
    while( fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
    }
   return slow;}static ListNode reverse(ListNode head){
    ListNode  prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

    }
   return prev;}
}