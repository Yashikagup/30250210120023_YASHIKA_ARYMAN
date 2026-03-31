class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class start_of_loop_ll {

    public static ListNode findLoopStart(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect collision
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Step 2: Find start of loop
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow; // starting node of loop
            }
        }

        return null; // no loop present
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating loop at node 3
        head.next.next.next.next.next = head.next.next;

        ListNode start = findLoopStart(head);

        if (start != null)
            System.out.println("Loop starts at node: " + start.val);
        else
            System.out.println("No loop present");
    }
}