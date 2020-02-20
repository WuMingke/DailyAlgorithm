package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.ListNode;

public class No83 {

    //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
// 示例 1:
//
// 输入: 1->1->2
//输出: 1->2
//
//
// 示例 2:
//
// 输入: 1->1->2->3->3
//输出: 1->2->3
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

    /**
     * 1
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode currentNode = head;
            while (currentNode != null && currentNode.next != null) {
                if (currentNode.next.val == currentNode.val) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode = currentNode.next;
                }
            }
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
