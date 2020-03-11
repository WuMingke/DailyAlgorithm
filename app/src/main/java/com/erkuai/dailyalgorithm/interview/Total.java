package com.erkuai.dailyalgorithm.interview;

import java.util.Stack;

public class Total {

    //链表
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // 删除单链表中的指定结点
    public void deleteNode(Node head, Node node) {
        // 删除尾节点   采用顺序查找找到尾节点的前一结点
        if (node.next == null) {
            while (head.next != node) {
                head = head.next;
            }
            head.next = null;
        }

        //要删除的结点是头结点
        else if (head == node) {
            head = null;
        }

        //要删除的是中间结点
        else {
            Node q = node.next;
            node.data = q.data;
            node.next = q.next;
        }

    }

    // 删除单链表中指定数值的结点
    public Node removeValue(Node head, int num) {
        Stack<Node> stack = new Stack<>();
        while (head != null) {
            if (head.data != num) {
                stack.push(head);
            }
            head = head.next;
        }
        while (!stack.isEmpty()) {
            stack.peek().next = head;
            head = stack.pop();
        }
        return head;
    }

    // 删除单链表中的倒数第k个结点
    public Node removeLastKthNode(Node head, int k) {
        if (k <= 0 || head == null) {
            return head;
        }
        Node p = head;
        for (int i = 0; i < k; i++) {
            if (p.next != null) {
                p = p.next;
            } else {    // k比链表长度长
                return head;
            }
        }
        Node q = head;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }


}
