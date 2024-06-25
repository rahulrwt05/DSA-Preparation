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
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode lnode=head;
if(head == null || head.next == null || k == 0) {return head;}
        int count=1;
        while(lnode.next!=null ){
            count++;
            lnode=lnode.next;
            
        }
        
       if(k==count){
        return head;
       }k=k%count;
        if(k==0){
                return head;
            }
        lnode.next=head;
        ListNode knode=head;
            
           int s=count-k-1;
        while(s>0){
knode=knode.next;s--;
        }
        head=knode.next;
        knode.next=null;
        
    return head;}
}