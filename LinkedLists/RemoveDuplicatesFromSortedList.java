package LinkedLists;

public class RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;
    }

    private ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode current = head;

        while(current.next != null) {
            if(current.val != current.next.val) {
                current = current.next;
            }
            else {
                current.next = current.next.next;
            }
        }
        return head;
    }
}
