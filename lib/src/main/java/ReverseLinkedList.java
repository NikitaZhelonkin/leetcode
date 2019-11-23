import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }

    public ListNode reverseListIterative(ListNode head){
        ListNode last = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = last;
            last = head;
            head = next;
        }
        return last;
    }

    public ListNode helper(ListNode head, ListNode last){
        if (head == null) return last;
        ListNode next = head.next;
        head.next = last;
        return helper(next, head);
    }
}
