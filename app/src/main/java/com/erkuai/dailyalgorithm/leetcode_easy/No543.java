package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No543 {

    //给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
//
// 示例 :
//给定二叉树
//
//
//          1
//         / \
//        2   3
//       / \
//      4   5
//
//
// 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
//
// 注意：两结点之间的路径长度是以它们之间边的数目表示。
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
    class Solution {

        private int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return max;
        }

        private int depth(TreeNode root) {
            if (root == null) return 0;
            int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            max = Math.max(leftDepth + rightDepth, max);
            return Math.max(leftDepth, rightDepth) + 1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}