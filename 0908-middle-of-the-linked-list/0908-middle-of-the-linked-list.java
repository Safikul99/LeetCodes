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
    public ListNode middleNode(ListNode head) {
        ListNode slo=head,fst=head;
        while(fst!=null && fst.next!=null)
        {
            slo=slo.next;
            fst=fst.next.next;
        }
        return slo;
    }
}