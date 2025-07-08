public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // int[] arr = {1};
        ListNode head = new ListNode(arr[0]);
        ListNode add = head;
        for (int i = 1; i < arr.length; i++) {
            add.next = new ListNode(arr[i]);
            add = add.next;
        }

        // ListNode iter = head;
        // while (iter != null) {
        //     System.out.println(iter.val);
        //     iter = iter.next;
        // }

        Solution solution = new Solution();

        ListNode res = solution.removeNthFromEnd(head, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
