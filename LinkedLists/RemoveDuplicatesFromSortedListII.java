package LinkedLists;

public class RemoveDuplicatesFromSortedListII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode fast = head;
        ListNode slow = dummy;

        slow.next = fast;

        while(fast != null) {
            // skipping duplicate nodes
            while(fast.next != null && fast.next.val == fast.val) {
                fast = fast.next;
            }

            // if slow pointer is near to fast pointer , there's no duplicate
            if(slow.next == fast) {
                slow = slow.next;
                fast = fast.next;
            }
            // if slow pointer is away from fast pointer , indicates there's a duplicate
            else {
                slow.next = fast.next;
                fast = slow.next;
            }
        }
        return dummy.next;
    }
}
