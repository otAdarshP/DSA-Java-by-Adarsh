package StacksAndQueues;
import java.util.Stack;

import static StacksAndQueues.stackClass.stack.peek;

public class CustomStackImplementation {
    public static void main(String[] args) {
        stackClass.stack s = new stackClass.stack();
        s.push(12);
        s.push(22);
        s.push(32);
        s.push(42);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.peek());
    }
}


