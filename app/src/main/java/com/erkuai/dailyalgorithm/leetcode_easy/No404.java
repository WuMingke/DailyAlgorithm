package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No404 {

    //计算给定二叉树的所有左叶子之和。
//
// 示例：
//
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
//
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
     * 1
     */
    class Solution {
        int res = 0;//存储结果

        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null)//root为空直接返回0
                return res;
            getSum(root);//递归函数,求得结果
            return res;
        }

        public void getSum(TreeNode root) {
            if (root.left != null) {//root.left不能为空
                //root.left为左叶子  要是叶子结点
                if (root.left.left == null && root.left.right == null)
                    res += root.left.val;//结果增加
                else//否则继续递归
                    getSum(root.left);
            }
            if (root.right != null)//root.right不能为空
                getSum(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
