package Classroom;
int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
public class find_starting_point_of_loop {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
    }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) { // Cycle found
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; // This is the start of the loop
            }
            class ListNode {
    
}
        }
        return null;
    }
}
