package m03_04;

import java.util.Stack;

class MyQueue {
    private Stack stack1;
    private Stack stack2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        for (int i1 = stack1.size() - 1; i1 >= 0; i1--) {
            stack2.push(stack1.pop());
        }
        int pop = (int) stack2.pop();
        for (int i = stack2.size() - 1; i >= 0; i--) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        for (int i1 = stack1.size() - 1; i1 >= 0; i1--) {
            stack2.push(stack1.pop());
        }
        int peek = (int) stack2.peek();
        for (int i = stack2.size() - 1; i >= 0; i--) {
            stack1.push(stack2.pop());
        }
        return peek;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty();
    }
}
