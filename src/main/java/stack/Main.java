package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(3);
        myStack.push(8);

        System.out.println("Max element in stack: " + myStack.max());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Max element in stack: " + myStack.max());
    }

    static class MyStack {
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> maxStack = new Stack<>();

        public void push(Integer value) {
            if (maxStack.isEmpty() || value >= maxStack.peek()) {
                maxStack.push(value);
            }
            stack.push(value);
        }

        public Integer pop() {
            if (stack.peek().equals(maxStack.peek())) {
                maxStack.pop();
            }
            return stack.pop();
        }

        public Integer max() {
            return maxStack.peek();
        }
    }
}
