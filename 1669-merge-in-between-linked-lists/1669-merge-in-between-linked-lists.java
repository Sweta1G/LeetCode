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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr= list1;
        int i=0;
        while(i<a-1){
            curr= curr.next;
            i++;
        }
        ListNode xy= curr;
        while(i<=b){
            curr= curr.next;
            i++;
        }
        ListNode end= list2;
        ListNode head= list2;
        while(end.next!=null) end= end.next;
        end.next= curr;
        xy.next= list2;
        return list1;
    }
}