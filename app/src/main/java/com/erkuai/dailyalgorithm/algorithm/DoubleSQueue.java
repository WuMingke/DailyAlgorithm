package com.erkuai.dailyalgorithm.algorithm;

import java.util.Stack;

/**
 * Created by Administrator on 2019/8/3.
 * <p>
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class DoubleSQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * 入栈
     * 时间复杂度：O(1)，空间复杂度：O(n)
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 出栈
     * 时间（摊还）复杂度：O(1)，空间复杂度：O(1)
     * <p>
     * 后进先出 转换为 先进先出
     */
    public int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("栈为空！");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
