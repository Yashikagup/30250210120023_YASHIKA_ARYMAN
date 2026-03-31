class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class remove_duplicates_ll {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;   // remove duplicate
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
