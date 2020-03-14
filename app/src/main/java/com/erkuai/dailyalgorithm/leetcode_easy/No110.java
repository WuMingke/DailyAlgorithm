package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No110 {

    //给定一个二叉树，判断它是否是高度平衡的二叉树。
//
// 本题中，一棵高度平衡二叉树定义为：
//
//
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
//

// Related Topics 树 深度优先搜索

    /**
     * 2
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return getTreeDepth(root) != -1;
        }

        private int getTreeDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftDepth = getTreeDepth(root.left);
            if (leftDepth == -1) {
                return -1;
            }
            int rightDepth = getTreeDepth(root.right);
            if (rightDepth == -1) {
                return -1;
            }
            if (Math.abs(leftDepth - rightDepth) > 1) {
                return -1;
            }
            return Math.max(leftDepth, rightDepth) + 1;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
