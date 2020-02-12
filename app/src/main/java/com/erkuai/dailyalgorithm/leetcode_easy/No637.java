package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No637 {
    //给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
//
// 示例 1:
//
// 输入:
//    3
//   / \
//  9  20
//    /  \
//   15   7
//输出: [3, 14.5, 11]
//解释:
//第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
//
//
// 注意：
//
//
// 节点值的范围在32位有符号整数范围内。
//
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
        public List<Double> averageOfLevels(TreeNode root) {
            List<Integer> count = new ArrayList<>();
            List<Double> res = new ArrayList<>();
            average(root, 0, res, count);
            for (int i = 0; i < res.size(); i++) {
                res.set(i, res.get(i) / count.get(i));
            }
            return res;
        }

        private void average(TreeNode t, int i, List<Double> sum, List<Integer> count) {
            if (t == null) return;
            if (i < sum.size()) {
                sum.set(i, sum.get(i) + t.val);
                count.set(i, count.get(i) + 1);
            } else {
                sum.add(t.val * 1.0);
                count.add(1);
            }
            average(t.left, i + 1, sum, count);
            average(t.right, i + 1, sum, count);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
