package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No687 {
    //给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
//
// 注意：两个节点之间的路径长度由它们之间的边数表示。
//
// 示例 1:
//
// 输入:
//
//
//              5
//             / \
//            4   5
//           / \   \
//          1   1   5
//
//
// 输出:
//
//
//2
//
//
// 示例 2:
//
// 输入:
//
//
//              1
//             / \
//            4   5
//           / \   \
//          4   4   5
//
//
// 输出:
//
//
//2
//
//
// 注意: 给定的二叉树不超过10000个结点。 树的高度不超过1000。
// Related Topics 树 递归


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
     * 不懂？
     */
    class Solution {

        int ans = 0;

        public int longestUnivaluePath(TreeNode root) {
            arrowLength(root);
            return ans;
        }

        public int arrowLength(TreeNode root) {
            if (root == null) return 0;
            int left = arrowLength(root.left);
            int right = arrowLength(root.right);
            int arrowLeft = 0, arrowRight = 0;
            if (root.left != null && root.left.val == root.val) {
                arrowLeft += left + 1;
            }
            if (root.right != null && root.right.val == root.val) {
                arrowRight += right + 1;
            }
            ans = Math.max(ans, arrowLeft + arrowRight);
            return Math.max(arrowLeft, arrowRight);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
