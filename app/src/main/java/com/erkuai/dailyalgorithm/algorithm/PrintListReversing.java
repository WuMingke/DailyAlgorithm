package com.erkuai.dailyalgorithm.algorithm;

import com.erkuai.dailyalgorithm.entity.ListNode;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Handler;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 输入一个链表，从尾到头打印链表每个节点的值
 */

public class PrintListReversing {

    /**
     * 利用栈输出
     */
    public static ArrayList<Integer> printListReversing(ListNode headNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode> listNodes = new Stack<>();
        while (headNode != null) {
            listNodes.push(headNode);
            headNode = headNode.next;
        }

        while (!listNodes.isEmpty()) {
            list.add(listNodes.pop().val);
        }

        return list;
    }

    /**
     * ?
     * 递归（其实底层还是栈）
     */
    public static ArrayList<Integer> printListReversing1(ListNode headNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (headNode != null) {
            if (headNode.next != null) {
                list = printListReversing1(headNode.next);
            }
            list.add(headNode.val);
        }
        return list;
    }

}
