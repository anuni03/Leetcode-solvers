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
    public ListNode rev(ListNode head){
        ListNode prev=null,temp=null;
        ListNode curr=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
     ListNode slow=head;
     ListNode fast=head.next;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     slow.next=rev(slow.next);
     slow=slow.next;
     ListNode st=head;
     while(slow!=null){
        if(st.val!=slow.val)
        return false;
        slow=slow.next;
        st=st.next;
     }
     return true;   
    }
}