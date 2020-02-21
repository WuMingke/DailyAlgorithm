package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.Stack;

public class No155 {

    //设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
//
//
// push(x) -- 将元素 x 推入栈中。
// pop() -- 删除栈顶的元素。
// top() -- 获取栈顶元素。
// getMin() -- 检索栈中的最小元素。
//
//
// 示例:
//
// MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
//
// Related Topics 栈 设计

    /**
     * 1
     */


    /**
     * 相同点：大家都返回栈顶的值。
     * 不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
     */

    class MinStack {

        private Stack<Integer> stack;
        //用一个栈来存最小值
        private Stack<Integer> minStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (!minStack.isEmpty()) {
                Integer topValue = minStack.peek();
                if (x <= topValue) {
                    minStack.push(x);
                }
            } else {
                minStack.push(x);
            }
        }

        public void pop() {
            Integer pop = stack.pop();
            int top = minStack.peek();
            if (pop == top) {
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
