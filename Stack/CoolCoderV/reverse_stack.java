import java.util.Stack;

public class reverse_stack {

    public static void pushAtBottom(Stack<Integer> stack, int element) {
        // Base case: if the stack is empty, push the element
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Pop the top element
        int topElement = stack.pop();

        // Recursive call to push the element at the bottom
        pushAtBottom(stack, element);

        // Push the popped element back on top of the stack
        stack.push(topElement);
    }

    public static void reverseStack(Stack<Integer> s) {
        // Base case: if the stack is empty, return
        if (s.isEmpty()) {
            return;
        }
        // Pop the top element
        int topElement = s.pop();
        // Recursive call to reverse the rest of the stack
        reverseStack(s);
        // Push the popped element at the bottom of the stack
        pushAtBottom(s, topElement);

    }

    public static void printStack(Stack<Integer> s) {
        // Print the elements in the original order
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s); // Print the original stack
        reverseStack(s); // Reverse the stack
        printStack(s); // Print the reversed stack
    }
}
