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
        if(head==null || head.next==null) return head;
        ListNode prev= null;
        ListNode curr= head;
        
        while(curr!=null){
            ListNode next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1= reverse(l1);
        l2= reverse(l2);
        ListNode res= new ListNode(0), temp= res;
        int carry= 0;
        
        while(l1!=null && l2!=null){
            int x= l1.val + l2.val + carry;
            if(x>9){
                temp.next= new ListNode(x%10);
                carry= x/10;
            }
            else {
                temp.next= new ListNode(x);
                carry= 0;
            }
            l1= l1.next;
            l2= l2.next;
            temp= temp.next;
        }
        while(l1!=null){
            int x= l1.val + carry;
            if(x>9){
                temp.next= new ListNode(x%10);
                carry= x/10;
            }
            else{
                temp.next= new ListNode(x);
                carry= 0;
            }
            
            l1= l1.next;
            temp= temp.next;
        }
        while(l2!=null){
            int x= l2.val + carry;
            if(x>9){
                temp.next= new ListNode(x%10);
                carry= x/10;
            }
            else{
                temp.next= new ListNode(x);
                carry= 0;
            }
            temp= temp.next;
            l2= l2.next;
        }
        if(carry!=0){
            temp.next= new ListNode(carry);
        }
        
        return reverse(res.next);
        // return res.next;
    }
}