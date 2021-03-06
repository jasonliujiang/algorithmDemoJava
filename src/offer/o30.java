package offer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */
public class o30 {
    private Stack<Integer> minStack = new Stack<Integer>();
    private Stack<Integer> dataStack = new Stack<Integer>();
    //创建一个辅助栈，每次跟随同步入栈出栈
    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(minStack.peek(),node));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();

    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();

    }
}
