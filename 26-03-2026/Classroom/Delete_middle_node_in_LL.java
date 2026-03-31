class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Delete_middle_node_in_LL {

    public static ListNode deleteMiddle(ListNode head) {

        // If only one node exists
        if (head == null || head.next == null)
            return null;

        // Step 1: find length
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: find middle index
        int mid = len / 2;

        // Step 3: move to node before middle
        temp = head;
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }

        // Step 4: delete middle node
        temp.next = temp.next.next;

        return head;
    }
}
