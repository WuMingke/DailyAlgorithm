package com.erkuai.dailyalgorithm.leetcode_easy;

import android.icu.text.PluralRules;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class No653 {
    //给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
//
// 案例 1:
//
//
//输入:
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 9
//
//输出: True
//
//
//
//
// 案例 2:
//
//
//输入:
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 28
//
//输出: False
//
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
    class Solution {
        public boolean findTarget(TreeNode root, int k) {
            HashSet<Integer> set = new HashSet<>();
            return find(root, k, set);
        }

        private boolean find(TreeNode root, int k, Set<Integer> set) {
            if (root == null) {
                return false;
            }
            if (set.contains(k - root.val)) {
                return true;
            }
            set.add(root.val);

            return find(root.left, k, set) || find(root.right, k, set);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
