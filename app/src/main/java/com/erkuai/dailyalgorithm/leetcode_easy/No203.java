package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.ListNode;

public class No203 {

    //删除链表中等于给定值 val 的所有节点。
//
// 示例:
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
//
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return null;
            head.next = removeElements(head.next, val);
            if (head.val == val) {
                return head.next;
            } else {
                return head;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
