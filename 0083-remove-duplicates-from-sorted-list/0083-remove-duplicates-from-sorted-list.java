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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        ListNode curr=head;
        ListNode temp=head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val)
            {
                curr=curr.next;
            }else{
                prev.next=curr.next;
                curr=curr.next;
                prev=curr;
            }
        }
      if(curr!=null && curr.val==prev.val)
      prev.next=null;
     return temp;
    }
}