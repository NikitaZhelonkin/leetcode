import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            visited.add(a);
            a = a.next;
        }
        while (b != null) {
            if (visited.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = toLinked(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 30, 31, 32});
        ListNode l2 = toLinked(new int[]{30, 31, 32});
        l1.next = l2;
        IntersectionTwoLinkedList solution = new IntersectionTwoLinkedList();
        System.out.println(solution.getIntersectionNode(l1, l2).val);
    }

    private static ListNode toLinked(int[] array) {
        ListNode head = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode oldHead = head;
            head = new ListNode(array[i]);
            head.next = oldHead;
        }
        return head;
    }

}
