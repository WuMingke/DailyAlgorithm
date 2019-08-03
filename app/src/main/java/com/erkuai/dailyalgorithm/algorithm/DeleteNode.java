package com.erkuai.dailyalgorithm.algorithm;

import com.erkuai.dailyalgorithm.entity.ListNode;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 给定单向链表的头指针和一个节点，在O(1)时间删除该节点。
 */

public class DeleteNode {

    public static void deleteNode(ListNode head, ListNode deListNode) {
        if (head == null || deListNode == null) {
            return;
        }

        if (head == deListNode) {
            head = null;
        } else {
            //若删除节点是末尾节点，往后移一个
            if (deListNode.next == null) {
                ListNode pointListNode = head;
                while (pointListNode.next.next != null) {
                    pointListNode = pointListNode.next;
                }
                pointListNode.next = null;
            } else {
                deListNode.val = deListNode.next.val;
                deListNode.next = deListNode.next.next;
            }
        }

    }
}
