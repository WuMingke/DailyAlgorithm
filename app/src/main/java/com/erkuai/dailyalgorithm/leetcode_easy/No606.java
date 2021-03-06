package com.erkuai.dailyalgorithm.leetcode_easy;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class No606 {

    //你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
//
// 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
//
// 示例 1:
//
//
//输入: 二叉树: [1,2,3,4]
//       1
//     /   \
//    2     3
//   /
//  4
//
//输出: "1(2(4))(3)"
//
//解释: 原本将是“1(2(4)())(3())”，
//在你省略所有不必要的空括号对之后，
//它将是“1(2(4))(3)”。
//
//
// 示例 2:
//
//
//输入: 二叉树: [1,2,3,null,4]
//       1
//     /   \
//    2     3
//     \
//      4
//
//输出: "1(2()(4))(3)"
//
//解释: 和第一个示例相似，
//除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
//
// Related Topics 树 字符串


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
     * 如果当前节点有两个孩子，那我们在递归时，需要在两个孩子的结果外都加上一层括号；
     *
     * 如果当前节点没有孩子，那我们不需要在节点后面加上任何括号；
     *
     * 如果当前节点只有左孩子，那我们在递归时，只需要在左孩子的结果外加上一层括号，而不需要给右孩子加上任何括号；
     *
     * 如果当前节点只有右孩子，那我们在递归时，需要先加上一层空的括号 () 表示左孩子为空，
     * 再对右孩子进行递归，并在结果外加上一层括号。
     *
     *
     */


    /**
     * 2
     */
    class Solution {
        public String tree2str(TreeNode t) {
            if (t == null) {
                return "";
            }
            if (t.left == null && t.right == null) {
                return t.val + "";
            }
            if (t.right == null) {
                return t.val + "(" + tree2str(t.left) + ")";
            }

            return t.val + "(" + tree2str(t.left) + ")" +
                    "(" + tree2str(t.right) + ")";
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
