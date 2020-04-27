package org.pengfei.problems.algo.P02_AddTwoNumbers;

public class AddTwoNumbersMain {
    public static void main(String[] args) {
        //first list
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(3);
        n1.next=n2;
        ListNode n3 = new ListNode(3);
        n2.next=n3;

        //second list
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(9);
        n4.next=n5;
        ListNode n6 = new ListNode(8);
        n5.next=n6;


       /* // test getNode
        System.out.println("Test getNode method");
        ListNode l = P02_AddTwoNumbers.getNode(807);
        while (l != null) {
            System.out.println("val: " + l.val);
            l = l.next;
        }*/

        // test getNumber
        /*long num1 = Solution01.getNumber(n1);
        System.out.println("num1: " + num1);

        long num2 = Solution01.getNumber(n4);
        System.out.println("num2: " + num2);*/

        //vars for benchmark
      long start,end;
        // test the Solution01
        start=System.nanoTime();
        ListNode l1 = Solution01.addTwoNumbers(n1,n4);
        end=System.nanoTime();
        System.out.println("Solution 1 uses: "+(end-start));
        while (l1 != null) {
            System.out.println("val: " + l1.val);
            l1 = l1.next;
        }

        // test the Solution02
        start=System.nanoTime();
        ListNode l2 = Solution02.addTwoNumbers(n1,n4);
        end=System.nanoTime();
        System.out.println("Solution 2 uses: "+(end-start));
        while (l2 != null) {
            System.out.println("val: " + l2.val);
            l2 = l2.next;
        }
    }
}
