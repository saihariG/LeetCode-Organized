package LinkedLists;

public class RemoveLinkedListElements {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
    }
    public ListNode removeElements(ListNode head, int val) {
        // if head is null or list has one node and its data is equal to val
        if(head == null || (head != null && head.next == null && head.val == val)) {
            return null;
        }
        // skipping if head's data is equal to val
        while(head != null && head.val == val) {
            head = head.next;
        }
        // if head is empty, all nodes equals val
        if(head == null) return null;
        // Having two nodes dummy & current(points to head).
        // linking dummy's next to current
        ListNode dummy = new ListNode();
        ListNode current = head;
        dummy.next = current;

        while(current != null) {
            // linking  dummy's next to current's next
            // And pointing current to dummy's next
            if(current.val == val) {
                dummy.next = current.next;
                current = dummy.next;
            }
            // traversing current & dummy
            else {
                current = current.next;
                dummy = dummy.next;
            }
        }

        return head;
    }
}
