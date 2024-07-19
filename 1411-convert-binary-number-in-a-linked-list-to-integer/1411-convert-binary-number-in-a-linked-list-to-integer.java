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
    public int getDecimalValue(ListNode head) {
        StringBuilder str=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            str.append(temp.val);
            temp=temp.next;
        }
        String st=str.toString();
        int k=st.length()-1;
        int value=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1')
            {
                value+=Math.pow(2,k);
            }
            k--;
        }
        return value;
    }
}