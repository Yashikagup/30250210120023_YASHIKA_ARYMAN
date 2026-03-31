class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Middle {

    public static ListNode findMiddle(ListNode head) {

        int len = 0;
        ListNode temp = head;

        // Step 1: find length
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: find middle index
        int mid = len / 2;

        // Step 3: move temp to middle
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        // Step 4: return middle node
        return temp;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = findMiddle(head);

        System.out.println("Middle node is: " + middle.val);
    }
}