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
        
       while(head!=null&&head.val==val)
       head=head.next;
       if(head==null)
       return null;
       ListNode temp=head;
       ListNode prev=head;
       while(temp!=null){
        if(temp.val==val){
        while(temp!=null && temp.val==val)
        temp=temp.next;
prev.next=temp;
prev=temp;
continue;
        }
        prev=temp;
        temp=temp.next;
       }
       return head;


    }
}