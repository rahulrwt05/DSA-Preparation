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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode knode=findknode(temp,k);
            head=knode;
            ListNode lnode=knode;
            while(temp!=null)
            {
              if(knode!=null)
              {
 ListNode knext=knode.next;
 knode.next=null;
 rev(temp);
 lnode=temp;
 temp=knext;
 
 
 
              }
              else{
                lnode.next=temp;
                break;
              }knode=findknode(temp,k);lnode.next=knode;
}
return head;
    }static ListNode findknode(ListNode head, int k){
        while(head!=null &&  k>1){
           k--;
            head=head.next;
        }
   return head; 
   }
   static ListNode rev(ListNode head){
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
   }
}