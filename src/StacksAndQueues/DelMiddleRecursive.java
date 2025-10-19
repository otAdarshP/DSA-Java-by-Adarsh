package StacksAndQueues;

import java.util.Stack;

public class DelMiddleRecursive {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stack: " + stack);
        deleteMiddleRec(stack, 0, stack.size());
        System.out.println("After deleting middle: " + stack);
    }

    public static void deleteMiddleRec(Stack<Integer> stack, int current, int size){
        if (stack.isEmpty()){
            return;
        }

        size = stack.size();
        int mid = size / 2;

        if (current == mid){
            stack.pop();
            return;
        }

        int top = stack.pop();

        deleteMiddleRec(stack, current+1, size);

        stack.push(top);

    }
}
