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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head==null || head.next==null){
        return head;
       }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        int size=right-left;
        while(size>0){
            ListNode forw=curr.next;
            curr.next=forw.next;
            forw.next=prev.next;
             prev.next=forw;
            size--;
             
           
           
            
            
          
        }


       return dummy.next; }
}