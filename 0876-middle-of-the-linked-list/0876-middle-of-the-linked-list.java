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
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        
        int size=0, count=0;
        ListNode curr=head;
        while(curr!=null) {
            size++;
            curr= curr.next;
        }
        curr=head;
        while(count<(size/2)){
            count++;
            curr=curr.next;
        }
        head= curr;
        return head;
        
    }
}