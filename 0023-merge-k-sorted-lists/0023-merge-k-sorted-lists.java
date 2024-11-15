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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> arr= new PriorityQueue<>();
        
        for(int i=0; i<lists.length; i++){
            ListNode curr= lists[i];
            while(curr!=null){
                arr.add(curr.val);
                curr= curr.next;
            }
        }
        ListNode res= new ListNode(0);
        ListNode tmp= res;
        while(arr.size()>0){
            tmp.next= new ListNode(arr.poll());
            tmp= tmp.next;
        }
        return res.next;
    }
}