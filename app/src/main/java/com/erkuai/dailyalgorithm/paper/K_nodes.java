package com.erkuai.dailyalgorithm.paper;

import com.erkuai.dailyalgorithm.entity.TreeNode;

public class K_nodes {

    // 求出该二叉树中第K层中的结点个数（根结点为第0层）

    private int k_nodes(TreeNode root, int k) {
        if (root == null)
            return 0;
        if (k == 0)
            return 1;//根结点
        if (k < 0)
            return 0;
        else
            return k_nodes(root.left, k - 1) + k_nodes(root.right, k - 1);
    }
}
