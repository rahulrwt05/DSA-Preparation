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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null ){
            return head;
        }int k=2;

        ListNode knode=findknode(temp,k);
        head=knode;
        ListNode knext=null;
        ListNode lnode=null;
        while(temp!=null){
      if(knode!=null){    knext=knode.next;  knode.next=null;
            rev(temp);
            lnode=temp;
temp=knext;
        }else{
                lnode.next=temp;
                break;
              }
knode=findknode(temp,k);
lnode.next=knode;
        
        }
    return head;}static ListNode  findknode(ListNode head,int k){
        while(head!=null && k>1){
            k--;
            head=head.next;
        }
    return head;}
static ListNode rev(ListNode head){
    ListNode curr=head;
    ListNode prev=null;
    while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
return prev;}}