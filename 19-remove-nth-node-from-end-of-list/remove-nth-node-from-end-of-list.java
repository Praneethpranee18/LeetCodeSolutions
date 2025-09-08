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
        if(head == null) return null;
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            cnt = cnt+1;
            temp = temp.next;
        }
        if(cnt < n) return null;
        if(cnt == n) return head.next;
        ListNode curr = head;
        for(int i=0;i<cnt-n-1;i++){
            curr =curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}