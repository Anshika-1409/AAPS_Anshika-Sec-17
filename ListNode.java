import java.util.*;

public class ListNode {
    int val;
    ListNode next;

    // Constructor for ListNode with a value
    ListNode(int x) {
        val = x;
    }

    // Constructor for ListNode with no arguments
    ListNode() {
    }
}

public class removeN {
    public ListNode remove(ListNode head, int n) {
        ListNode dummy = new ListNode(); // Dummy node
        dummy.next = head;
        ListNode f = dummy;
        ListNode s = dummy;

        // Move the second pointer `n` steps ahead
        for (int i = 0; i < n; i++) {
            s = s.next;
        }

        // Move both pointers until the second pointer reaches the end
        while (s.next != null) {
            f = f.next;
            s = s.next;
        }

        // Remove the N-th node from the end
        f.next = f.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        removeN obj = new removeN();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;

        ListNode result = obj.remove(head, n);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}