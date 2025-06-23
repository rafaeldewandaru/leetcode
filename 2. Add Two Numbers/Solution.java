import java.util.*;

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

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Boolean carry = false;
        ListNode curr = new ListNode();
        ListNode first = curr;

        Boolean pause1 = false;
        Boolean pause2 = false;

        while (l1 != null || l2 != null) {
            int val;
            int val1;
            int val2;

            if (l1 == null) {
                pause1 = true;
                val1 = 0;
            }

            else {
                val1 = l1.val;
            }

            if (l2 == null) {
                pause2 = true;
                val2 = 0;
            }

            else {
                val2 = l2.val;
            }

            if (carry) {
                carry = false;
                val = val1 + val2 + 1;
            }

            else {
                val = val1 + val2;
            }

            if (val%10 != val) {
                val = val%10;
                carry = true;
            }

            curr.val = val;

            if (!pause1) {
                l1 = l1.next;
            }

            if (!pause2) {
                l2 = l2.next;
            }

            if (l1 == null && l2 == null ) {
                if (carry) {
                    curr.next = new ListNode();
                    curr = curr.next;
                    curr.val = 1;
                }
            }

            else {
                curr.next = new ListNode();
                curr = curr.next;  
            }

        }

        return first;
    }
}