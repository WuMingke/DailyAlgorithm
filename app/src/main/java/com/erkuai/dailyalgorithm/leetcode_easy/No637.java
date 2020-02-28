package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    /**
     * 广度优先搜索
     * <p>
     * 将根节点放入队列 queue 中，随后对于 queue 中的每一个节点，
     * 我们将它的子节点放入临时队列 temp 中。在 queue 中的所有节点都处理完毕后，
     * temp 中即存放了所有在 queue 对应的层数的下一层中的节点。在将子节点放入
     * temp 的过程中，我们也可以顺便计算出 queue 中节点的数值之和，以此得到平均值。
     * 最后我们将 temp 赋值给 queue，继续进行下一轮的广度优先搜索，直到某一轮 temp 为空。
     */

    /**
     * 1
     */
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                long sum = 0, count = 0;
                Queue<TreeNode> temp = new LinkedList<>();
                while (!queue.isEmpty()) {
                    TreeNode n = queue.remove();
                    sum += n.val;
                    count++;
                    if (n.left != null)
                        temp.add(n.left);
                    if (n.right != null)
                        temp.add(n.right);
                }
                queue = temp;
                res.add(sum * 1.0 / count);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
