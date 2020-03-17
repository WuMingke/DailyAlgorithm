package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

/**
 * Created by Administrator on 2019/12/10 15:01.
 */

public class No437 {

    //给定一个二叉树，它的每个结点都存放着一个整数值。
//
// 找出路径和等于给定数值的路径总数。
//
//
// 示例：
//
// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//      10
//     /  \
//    5   -3
//   / \    \
//  3   2   11
// / \   \
//3  -2   1
//
//返回 3。和等于 8 的路径有:
//
//1.  5 -> 3
//2.  5 -> 2 -> 1
//3.  -3 -> 11
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
        public int pathSum(TreeNode root, int sum) {

            if (root == null) {
                return 0;
            }

            return paths(root, sum)
                    + pathSum(root.left, sum)
                    + pathSum(root.right, sum);
        }

        private int paths(TreeNode root, int sum) {

            if (root == null) {
                return 0;
            }

            int res = 0;
            if (root.val == sum) {
                res += 1;
            }

            res += paths(root.left, sum - root.val);
            res += paths(root.right, sum - root.val);

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
