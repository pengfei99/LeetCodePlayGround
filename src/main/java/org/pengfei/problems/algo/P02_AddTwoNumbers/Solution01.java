package org.pengfei.problems.algo.P02_AddTwoNumbers;


/** The idea of solution 1 is convert first the two input link list into int/long. This solution only works if the
 * number of two list and their sum can be represented in long/int. Otherwise, we will get arithmetic overflow. It will return
 * a wrong result.
 *
 * But this solution shows how to convert a ListNode to a long/int, and vise-versa.*/
 class Solution01 {

     static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long l1Num = Solution01.getNumber(l1);
        long l2Num = Solution01.getNumber(l2);
        long sum = l1Num + l2Num;
        System.out.println("sum: " + sum);
        return getNode(sum);
    }

     static long getNumber(ListNode l) {
        int power = 0;
        long result = 0;
        while (l != null) {
            long val = l.val * ((int) Math.pow(10, power));
            result += val;

            l = l.next;
            power++;
        }
        System.out.println("Result: " + result);
        return result;
    }

     static ListNode getNode(long num) {
        int base = 10;
        ListNode baseNode = null;
        ListNode node = null;
        if (num == 0) return new ListNode(0);
        else {
            while (num > 0) {
                int val = (int)num % base;
                // System.out.println("val: "+val);
                num = (num - val) / base;
                // System.out.println("num: "+num);

                if (node == null) {
                    //System.out.println("Creat new node with value: "+val);
                    node = new ListNode(val);
                    baseNode = node;
                } else {
                    // System.out.println("Creat new node with value: "+val);
                    ListNode nextNode = new ListNode(val);
                    node.next = nextNode;
                    node = nextNode;
                }

            }
        }
        return baseNode;
    }


}
