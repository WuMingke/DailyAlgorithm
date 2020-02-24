package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class No257 {

    //给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例:
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
// Related Topics 树 深度优先搜索


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
        public List<String> binaryTreePaths(TreeNode root) {
            LinkedList<String> paths = new LinkedList<>();
            initPaths(root, "", paths);
            return paths;
        }

        public void initPaths(TreeNode root, String path, List<String> paths) {
            if (root != null) {
                path = path + String.valueOf(root.val);
                if (root.left == null && root.right == null) {
                    paths.add(path);
                } else {
                    path = path + "->";
                    initPaths(root.left, path, paths);
                    initPaths(root.right, path, paths);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
