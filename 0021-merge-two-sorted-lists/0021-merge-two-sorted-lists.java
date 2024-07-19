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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode sm=null;
      ListNode head=null;
      if(list1==null)
      return list2;
      if(list2==null)
      return list1;
      if(list2.val<list1.val){
        sm=list2;
        head=list2;
        list2=list2.next;
      } else{
         sm=list1;
         head=list1;
        list1=list1.next;
      }
      while(list1!=null && list2!=null){
        if(list1.val<list2.val){
            sm.next=list1;
            sm=list1;
            list1=list1.next;
        }else{
            sm.next=list2;
            sm=list2;
            list2=list2.next;
        }
      }
        while(list1!=null){
        sm.next=list1;
        sm=list1;
        list1=list1.next;
      }
        while(list2!=null){
        sm.next=list2;
        sm=list2;
        list2=list2.next;
      }
return head;

    }
}