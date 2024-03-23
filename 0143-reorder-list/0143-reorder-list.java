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
    private ListNode findLast(ListNode head){
        ListNode curr= head;
        while(curr.next.next!=null)
            curr=curr.next;
        ListNode last= curr.next;
        curr.next= null;
        return last;
    }
    private int length(ListNode head){
        ListNode curr= head;
        int c=0;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
        return c;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        int size= length(head);
        int c=0;
        ListNode curr= head;
        while(c<size/2){
            // if(c%2==0){
                ListNode end= findLast(head);
                end.next= curr.next;
                curr.next= end;
                c++;
                curr= curr.next.next;
            if(curr==null) break;
            // }
        }
        
    }
}