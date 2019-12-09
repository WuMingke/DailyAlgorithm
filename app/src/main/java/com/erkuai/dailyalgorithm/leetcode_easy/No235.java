package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No235 {

    //给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
//
// 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
//
// 例如，给定如下二叉搜索树: root = [6,2,8,0,4,7,9,null,null,3,5]
//
//
//
//
//
// 示例 1:
//
// 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//输出: 6
//解释: 节点 2 和节点 8 的最近公共祖先是 6。
//
//
// 示例 2:
//
// 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//输出: 2
//解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
//
//
//
// 说明:
//
//
// 所有节点的值都是唯一的。
// p、q 为不同节点且均存在于给定的二叉搜索树中。
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

//        我们来复习一下二叉搜索树（BST）的性质：
//        1、节点 N 左子树上的所有节点的值都小于等于节点 N 的值
//        2、节点 N 右子树上的所有节点的值都大于等于节点 N 的值
//        3、左子树和右子树也都是 BST

        //递归
//        从根节点开始遍历树
//        如果节点 p 和节点 q 都在右子树上，那么以右孩子为根节点继续 1 的操作
//        如果节点 p 和节点 q 都在左子树上，那么以左孩子为根节点继续 1 的操作
//        如果条件 2 和条件 3 都不成立，这就意味着我们已经找到节 p 和节点 q 的 LCA 了

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            int parentVal = root.val;
            int pVal = p.val;
            int qVal = q.val;
            if (pVal > parentVal && qVal > parentVal) {
                return lowestCommonAncestor(root.right, p, q);
            } else if (pVal < parentVal && qVal < parentVal) {
                return lowestCommonAncestor(root.left, p, q);
            } else {
                return root;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
