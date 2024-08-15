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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode(0);
        ListNode t= ans;
        
        int c=0;
        while(l1!= null && l2!= null){
            int tp=l1.val+l2.val+c;
            if(tp<10){
                t.next= new ListNode(tp);
                c= 0;
            }
            else{
                t.next= new ListNode(tp%10);
                c=1;
            }
            t= t.next;
            l1= l1.next;
            l2= l2.next;
        }
        
        while(l1!=null){
            int tp= l1.val+c;
            if(tp<10){
                t.next= new ListNode(tp);
                c= 0;
            }
            else{
                t.next= new ListNode(tp%10);
                c=1;
            }
            t= t.next;
            l1= l1.next;
        }
        while(l2!=null){
            int tp= l2.val+c;
            if(tp<10){
                t.next= new ListNode(tp);
                c= 0;
            }
            else{
                t.next= new ListNode(tp%10);
                c=1;
            }
            t= t.next;
            l2= l2.next;
        }
        if(c==1)
            t.next= new ListNode(1);
        return ans.next;
    }
}