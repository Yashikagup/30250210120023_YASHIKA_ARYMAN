package Assignment;

public class Remove_Nth_node_from_end {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow is now right before the node to be deleted
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}

// Definition for singly-linked list (if needed)
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}