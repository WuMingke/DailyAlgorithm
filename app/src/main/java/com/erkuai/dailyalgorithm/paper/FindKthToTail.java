package com.erkuai.dailyalgorithm.paper;

import com.erkuai.dailyalgorithm.entity.ListNode;

public class FindKthToTail {

    // 输入一个链表，输出该链表中倒数第k个结点。

    public static ListNode FindToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode pre = head;
        ListNode last = head;
        for (int i = 1; i < k; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else {
                return null;
            }
        }
        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;

    }


    public static void main(String[] args) {
        // 定义节点
        ListNode root = new ListNode(0);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(9);
        // 连接节点
        root.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode tmpnode = FindToTail(root, 5);

        System.out.println(tmpnode.val);
    }
}
