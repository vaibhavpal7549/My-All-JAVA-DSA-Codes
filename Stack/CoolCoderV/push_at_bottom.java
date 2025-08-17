import java.util.*; // Importing the Stack class from java.util package
// Java program to push an element at the bottom of a stack
public class push_at_bottom {

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


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        System.out.println("Original Stack: " + s);

        int elementToPush = 6;
        pushAtBottom(s, elementToPush);

        System.out.println("Stack after pushing " + elementToPush + " at the bottom: " + s);
        System.out.println();

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        // Output: Stack after pushing 6 at the bottom: [6, 1, 2, 3]
        // Explanation: The element 6 is pushed at the bottom of the stack, so the stack becomes [6, 1, 2, 3]

    }
}


