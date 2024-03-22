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
        if(head==null) return head;
        ListNode prev= null;
        ListNode curr= head;
        while(curr!= null){
            ListNode next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow= head;
        ListNode fast= head.next;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        // ListNode rever= reverse(slow);
        ListNode rev= reverse(slow);

        // ListNode rev= rever;
        // ListNode node= head;
        
        while(rev!=null && head!=null){
            if(rev.val != head.val) return false;
            // if(rev.val != node.val) return false;
            else{
                head= head.next;
                // node= node.next;
                rev= rev.next;
            }
        }
        return true;
    }
}