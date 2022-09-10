package LinkedLists;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // initialize current node to dummy's head for returning
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        // initialize carry to zero
        int carry = 0;

        ListNode p = l1;
        ListNode q = l2;


        while(p != null || q != null) {
            // storing the nodes val
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            // calculating sum & carry
            int sum = x + y + carry;
            carry = sum / 10; // to eliminate last digit

            current.next = new ListNode(sum % 10);
            current = current.next;

            // traversing p & q node
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }

        // edge case
        if(carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }


}

