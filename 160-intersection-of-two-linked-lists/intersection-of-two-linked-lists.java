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
         if(headA==null || headB==null){
            return null;
         }
         ListNode count1=headA;
         ListNode  count2=headB;
         int n1=0;
         while(count1!=null){
            n1++;
            count1=count1.next;
         }int n2=0;
         while(count2!=null){
            n2++;
            count2=count2.next;
         }
if(n1>n2){
    return intNode(headA,headB,n1-n2);
}
    return intNode(headB,headA,n2-n1);

    } static ListNode intNode(ListNode head1,ListNode head2, int d){
        while(d!=0){d--;
head1=head1.next;
        }
        while(head1!=head2){
            head1=head1.next;
            head2=head2.next;
        }
        return head1;
    }
}