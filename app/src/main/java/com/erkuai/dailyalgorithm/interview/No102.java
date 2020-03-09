package com.erkuai.dailyalgorithm.interview;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No102 {
    //给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
//
// 例如:
//给定二叉树: [3,9,20,null,null,15,7],
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
//
// 返回其层次遍历结果：
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
//
// Related Topics 树 广度优先搜索


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
        List<List<Integer>> levels = new ArrayList<List<Integer>>();

        public void helper(TreeNode node, int level) {
            // start the current level
            if (levels.size() == level)
                levels.add(new ArrayList<Integer>());

            // fulfil the current level
            levels.get(level).add(node.val);

            // process child nodes for the next level
            if (node.left != null)
                helper(node.left, level + 1);
            if (node.right != null)
                helper(node.right, level + 1);
        }

        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return levels;
            helper(root, 0);
            return levels;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
