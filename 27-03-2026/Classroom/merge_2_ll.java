class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class merge_2_ll {

    public static ListNode merge(ListNode l1, ListNode l2) {

        // Step 1: handle empty lists
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // Step 2: choose first node of result
        ListNode head;

        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        // Step 3: temp pointer for result list
        ListNode temp = head;

        // Step 4: merge remaining nodes
        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        // Step 5: attach remaining nodes
        if (l1 != null)
            temp.next = l1;

        if (l2 != null)
            temp.next = l2;

        return head;
    }
}
