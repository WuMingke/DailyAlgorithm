package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No783 {
    //给定一个二叉搜索树的根结点 root, 返回树中任意两节点的差的最小值。
//
// 示例：
//
//
//输入: root = [4,2,6,1,3,null,null]
//输出: 1
//解释:
//注意，root是树结点对象(TreeNode object)，而不是数组。
//
//给定的树 [4,2,6,1,3,null,null] 可表示为下图:
//
//          4
//        /   \
//      2      6
//     / \
//    1   3
//
//最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。
//
// 注意：
//
//
// 二叉树的大小范围在 2 到 100。
// 二叉树总是有效的，每个节点的值都是整数，且不重复。
//
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
    class Solution {
        List<Integer> vals;

        public int minDiffInBST(TreeNode root) {
            vals = new ArrayList();
            dfs(root);
            Collections.sort(vals);

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < vals.size() - 1; ++i)
                ans = Math.min(ans, vals.get(i + 1) - vals.get(i));

            return ans;
        }

        public void dfs(TreeNode node) {
            if (node == null) return;
            vals.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}