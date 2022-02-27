package LinkedLists;

public class LinkedListCycle2 {

    static class ListNode {
        ListNode next;
    }

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                ListNode current = head;

                while(current != slow) {
                    current = current.next;
                    slow = slow.next;
                }
                return slow;
            }

        }

        return null;
    }
}
