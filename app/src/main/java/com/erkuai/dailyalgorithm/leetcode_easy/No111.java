package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No111 {

    //给定一个二叉树，找出其最小深度。
// Related Topics 树 深度优先搜索 广度优先搜索


    /**
     * 2        同No104
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            if ((root.left == null) && (root.right == null)) {
                return 1;
            }

            int min_depth = Integer.MAX_VALUE;
            if (root.left != null) {
                min_depth = Math.min(minDepth(root.left), min_depth);
            }
            if (root.right != null) {
                min_depth = Math.min(minDepth(root.right), min_depth);
            }

            return min_depth + 1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
