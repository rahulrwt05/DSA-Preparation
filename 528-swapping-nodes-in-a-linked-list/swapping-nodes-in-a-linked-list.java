class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head,slow=head,f=null;
        for(int i=1;i<k;i++) fast=fast.next;
        f=fast;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int t=slow.val;
        slow.val=f.val;
        f.val=t;
        return head;
    }
}