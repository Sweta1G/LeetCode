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
    private int hcf(int a, int b){
        if (a == 0) 
            return b; 
        if (b == 0) 
            return a; 
  
        // Both the numbers are equal 
        if (a == b) 
            return a; 
  
        // x is greater 
        if (a > b) 
            return hcf(a - b, b); 
        return hcf(a, b - a); 
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr= head;
        while(curr.next!=null){
            ListNode next= curr.next;
            ListNode temp= new ListNode(hcf(curr.val,next.val));
            curr.next= temp;
            temp.next= next;
            curr= next;
        }
        
        return head;
    }
}