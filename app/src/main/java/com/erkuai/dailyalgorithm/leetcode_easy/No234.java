package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.ListNode;

import java.util.List;
import java.util.Stack;

public class No234 {

//请判断一个链表是否为回文链表。
//
// 示例 1:
//
// 输入: 1->2
//输出: false
//
// 示例 2:
//
// 输入: 1->2->2->1
//输出: true
//
//
// 进阶：
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
// Related Topics 链表 双指针


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

        public boolean isPalindrome(ListNode head) {

            //第二种方法：用一个栈存储结点，后面的就在上面，然后从头遍历链表，跟栈中的比较，
            // 就是逆序与顺序的比较了，就可以判断是否是回文
            if (head == null) {
                return true;
            }
            Stack<ListNode> stack = new Stack<>();
            ListNode cur = head;
            while (cur != null) {
                stack.push(cur);
                cur = cur.next;
            }

            while (head.next != null) {
                if (head.val != stack.pop().val) {
                    return false;
                }
                head = head.next;
            }
            return true;


               /*
                使用快慢指针找到链表的中间位置；
                反转后半部分链表；
                逐一对比前后两部分链表；
                */
            //第一种方法：
//            // 边界条件：空链表或只有一个节点的链表
//            if (head == null || head.next == null) {
//                return true;
//            }
//
//            ListNode dummyNode = new ListNode(-1);
//            dummyNode.next = head;
//            ListNode slow = dummyNode;
//            ListNode fast = dummyNode;
//
//            // 慢指针一次走一步，快指针一次走两步，当快指针走到终点，慢指针刚好处于中点位置
//            while (fast != null && fast.next != null) {
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//
//            // fast指针置于下半段链表的起点
//            fast = slow.next;
//            // 断开前后两个链表
//            slow.next = null;
//            // slow指针置于前半段链表的起点
//            slow = dummyNode.next;
//
//            // 反转后半段链表
//            ListNode pre = null; // 保存指针前一节点的信息，用于反转
//            while (fast != null) {
//                ListNode nextTemp = fast.next;
//                fast.next = pre;
//                pre = fast;
//                fast = nextTemp;
//            }
//
//            // 前后半链表逐一比较，当链表长度为奇数时前半段链表长度比后半段多1，所以以后半段为准
//            // pre是后半段的
//            while (pre != null) {
//                if (slow.val != pre.val) {
//                    return false;
//                }
//                slow = slow.next;
//                pre = pre.next;
//            }
//            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
