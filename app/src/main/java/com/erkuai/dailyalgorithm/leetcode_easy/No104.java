package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No104 {

    //给定一个二叉树，找出其最大深度。
// Related Topics 树 深度优先搜索


    /**
     * 2        同No111
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                int left_height = maxDepth(root.left);
                int right_height = maxDepth(root.right);
                return Math.max(left_height, right_height) + 1;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
