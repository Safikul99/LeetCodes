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
    void rev(ListNode s,ListNode e)
    {
        ListNode p=null,c=s,n=s.next;
        while(p!=e)
        {
            c.next=p;
            p=c;
            c=n;
            if(n!=null)
            n=n.next;

        }
        
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {

        if(head==null || head.next==null || k==1)
        return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode brfore=dummy,e=head;
        int i=0;
        while(e!=null)
        {
            i++;
            if(i%k==0)
            {
                ListNode s=brfore.next,temp=e.next;
                rev(s,e);
                brfore.next=e;
                s.next=temp;
                brfore=s;
                e=temp;
            }
           else
           {
            e=e.next;
           }
            
        }
        return dummy.next;
     
     


        
    }
}