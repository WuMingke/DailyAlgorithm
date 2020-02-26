package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.MainActivity;
import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No530 {
    //给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
//
// 示例 :
//
//
//输入:
//
//   1
//    \
//     3
//    /
//   2
//
//输出:
//1
//
//解释:
//最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
//
//
// 注意: 树中至少有2个节点。
// Related Topics 树


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */

    /**
     * 1
     */
    class Solution {

        TreeNode pre;
        int res = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            inorder(root);
            return res;
        }

        private void inorder(TreeNode root) {
            if (root == null) return;
            inorder(root.left);
            if (pre != null) res = Math.min(res, root.val - pre.val);
            pre = root;
            inorder(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
