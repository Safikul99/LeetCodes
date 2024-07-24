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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        return null;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode tail=dummy;
        while(tail!=null && tail.next!=null)
        {
            if(tail.next.val==val)
            {
                ListNode temp=tail.next;
                tail.next=temp.next;

            }
            else
            {
              tail=tail.next;  
            }
        }
        return dummy.next;

        
    }
}