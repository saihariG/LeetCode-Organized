package PriorityQueues;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {};
        ListNode(int val) {this.val = val;}
    }

    private ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // adding all the node values to min heap
        for(ListNode head : lists) {
            while(head != null) {
                minHeap.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode();
        ListNode head = dummy;
        // creating a new list until min heap is empty
        while (!minHeap.isEmpty()) {
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }

        return dummy.next;
    }
}
