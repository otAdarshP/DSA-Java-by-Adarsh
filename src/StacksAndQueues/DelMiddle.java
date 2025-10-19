package StacksAndQueues;
import java.util.Stack;

public class DelMiddle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stack: " + stack);
        deleteMiddle(stack);
        System.out.println("After deleting middle: " + stack);
    }

    public static void deleteMiddle(Stack<Integer> stack){
        int size = stack.size();
        int middle = size / 2;

        Stack <Integer> tempStack = new Stack<Integer>();

        int i = 0;
        while (i < middle){
            tempStack.push (stack.pop());
            i++;
        }
        if (!stack.isEmpty()){
            stack.pop(); // removing the middle element
        }

        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }
}
