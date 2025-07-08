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
        ListNode dummy = new ListNode(0, head);
        ListNode remove = dummy, prev = dummy;

        for (int i = 0; i <= n; i++) {
            remove = remove.next;
        }

        while (remove != null) {
            remove = remove.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return dummy.next;
    }
}