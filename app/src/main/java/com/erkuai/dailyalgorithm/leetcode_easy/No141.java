package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.ListNode;

public class No141 {

    //给定一个链表，判断链表中是否有环。


    /**
     * 2
     */
    public class Solution {

        //快慢指针，快的一定会追上慢的
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != slow) {
                if (fast == null || fast.next == null) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
