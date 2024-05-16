package mid2.mid2_9_MapStackQueue.stack;

import java.util.LinkedList;
import java.util.Stack;

public class stackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack); //  [1, 2, 3]

        // 맨위에 값만 반환.(실제 꺼내지x)
        System.out.println("stack.peek() = " + stack.peek()); // 3

        // 실제 꺼내
        System.out.println("stack.pop() = " + stack.pop()); // 3
        System.out.println("stack.pop() = " + stack.pop()); // 2
        System.out.println("stack.pop() = " + stack.pop()); // 1
        System.out.println("stack = " + stack); // []

    }
}
