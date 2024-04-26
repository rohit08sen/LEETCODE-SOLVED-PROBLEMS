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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==n){
            head=head.next;
            return head;
        }
        int idx=size-n;
        ListNode prev=head;
        int i=0;
        while(i<idx-1){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}