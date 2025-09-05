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
        int cnt = 0;
        ListNode curr = head;
        while(curr != null){
            cnt = cnt+1;
            curr = curr.next;
        }
        ListNode temp = head;
        for(int i=0;i<(cnt/2);i++){
            temp = temp.next;
        }
        return temp;
    }
}