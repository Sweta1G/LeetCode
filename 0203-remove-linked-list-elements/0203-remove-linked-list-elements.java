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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        if(head.next==null && head.val==val) return null;
        
        
        
        ListNode curr= head;
        if(curr.next!=null && curr.next.val == val) {
            curr.next= curr.next.next;
            removeElements(curr,val);
        }
        else removeElements(curr.next,val);
        
        if(head.val==val){
            head= head.next;
            removeElements(head,val);
        }
        return head;
    }
}