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
    private ListNode reverse(ListNode head){
        ListNode prev= null;
        while(head!= null){
            ListNode nexxt= head.next;
            head.next= prev;
            prev=head;
            head= nexxt;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;
        
        head= reverse(head);
        ListNode curr= head, max=head;
        
        while(curr!=null && curr.next!=null){
            if(curr.next.val<max.val)
                curr.next= curr.next.next;
            else{
                curr= curr.next;
                max= curr;
            }
        }
        
        return reverse(head);
    }
}