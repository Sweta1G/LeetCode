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
    private int size(ListNode head){
        int sz=0;
        if(head==null) return sz;
        while(head!=null){
            sz++;
            head= head.next;
        }
        return sz;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz= size(head);
        if(sz==1 && n==1) return null;
        if(sz==n) return head.next;
        int t= sz-n;
        ListNode curr= head;
        while(t>1){
            t--;
            curr= curr.next;
        }
        curr.next= curr.next.next;
        return head;
    }
}