public class RemoveDuplicatesFromLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode last = head;
        ListNode x = head.next;
        while (x != null) {
            if (x.val == last.val) {
                last.next = x.next;
            } else {
                last = x;
            }
            x = x.next;
        }
        return head;
    }

}
