package org.pengfei.problems.algo.P02_AddTwoNumbers;

import java.util.List;

/** Solution 2, calculate directly from each node of the list. It does not have arithmetic overflow problem.*/
class Solution02 {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // use the dummy head to
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        // The situation is at least one list is not null, we continue to calculate
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // The while loop ends, two lists are all null, we need to create a new node, if carry has value.
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
