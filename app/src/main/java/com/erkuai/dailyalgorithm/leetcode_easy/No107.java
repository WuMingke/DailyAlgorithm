package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class No107 {

    //给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
// 例如：
//给定二叉树 [3,9,20,null,null,15,7],
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
//
// 返回其自底向上的层次遍历为：
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
//
// Related Topics 树 广度优先搜索


    /**
     * LinkedList 是一个继承于AbstractSequentialList的双向链表。
     * 它也可以被当作堆栈、队列或双端队列进行操作。
     */

    /**
     * 2
     */
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            ArrayList<List<Integer>> result = new ArrayList<>();
            LinkedList<TreeNode> treeNodes = new LinkedList<>();
            treeNodes.add(root);
            if (root == null) return result;

            while (!treeNodes.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = treeNodes.size();
                for (int i = 0; i < size; i++) {
                    TreeNode treeNode = treeNodes.remove();
                    //自上而下添加
                    list.add(treeNode.val);
                    if (treeNode.left != null) {
                        treeNodes.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        treeNodes.add(treeNode.right);
                    }
                }
                result.add(list);
            }
            //自下而上显示
            Collections.reverse(result);
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
