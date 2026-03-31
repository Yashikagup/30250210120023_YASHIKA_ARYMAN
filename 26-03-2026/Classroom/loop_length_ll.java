class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class loop_length_ll {

    public static int findLoopLength(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect collision
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Step 2: Count loop length
                int count = 1;
                fast = fast.next;

                while (slow != fast) {
                    count++;
                    fast = fast.next;
                }

                return count;
            }
        }

        return 0; // No loop
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating loop
        head.next.next.next.next.next = head.next.next;

        int length = findLoopLength(head);

        if (length > 0)
            System.out.println("Loop length = " + length);
        else
            System.out.println("No loop present");
    }
}
