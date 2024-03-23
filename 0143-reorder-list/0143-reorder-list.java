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
        while(head.next.next!=null)
            head=head.next;
        ListNode last= head.next;
        head.next= null;
        return last;
    }
    private int length(ListNode head){
        int c=0;
        while(head!=null){
            head= head.next;
            c++;
        }
        return c;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        int size= length(head);
        int c=0;
        ListNode curr= head;
        while(c++<size/2){
            ListNode end= findLast(head);
            end.next= curr.next;
            curr.next= end;
            curr= curr.next.next;
            if(curr==null) break;
        }
        
    }
}