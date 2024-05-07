/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
          node.val = node.next.val; // for eg node 2 wla hai 1-2-3-4 isme 
          //first step me 2 wale node me 3 daldega 1-3-3-4
        node.next = node.next.next;
        //isme ab node ka referenc sidhe skip kardega next ke next tak pahuchadiya   
    }
}